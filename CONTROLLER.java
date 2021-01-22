@RequestMapping(value = "/addConfiguration", method = RequestMethod.POST)
	public @ResponseBody void addConfiguration(@RequestBody String req, HttpServletResponse resp) throws Exception {
		EntityConfiguratorServiceImpl entityConfiguratorServiceImpls = new EntityConfiguratorServiceImpl();

		try {
			HashMap<String, String> requestData = new ObjectMapper().readValue(req, new TypeReference<HashMap<String, String>>() {});
			String entityName = requestData.get("entityName");
			String configid = requestData.get("configid");
			String configValue = requestData.get("configValue");

			LOGGER.info("Add configuration request data : {} : {} : {}", entityName, configid, configValue);
			entityConfiguratorServiceImpls.getentityMatch(entityName, configid, configValue);
		} catch (Exception e) {
			LOGGER.error("Exception occured in add Configuration {}", e.getMessage());
		}
	}
	
	@RequestMapping(value = "/refreshConfigMap", method = RequestMethod.GET)
	public @ResponseBody String addrefreshConfigMap(HttpServletResponse resp) throws Exception {
		ApplicationConfigurator applicationConfigurator = new ApplicationConfigurator();
		try {
			applicationConfigurator.refreshConfigMap();
		} catch (Exception e) {
			LOGGER.error("Exception occured in add Configuration {}", e.getMessage());
		}
		return "success";
	}

}
