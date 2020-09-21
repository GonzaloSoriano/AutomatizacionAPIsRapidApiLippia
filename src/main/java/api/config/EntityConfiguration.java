package api.config;

import services.ShortenService;

public enum EntityConfiguration {

    SHORTEN {
        @Override
        public Class<?> getEntityService() {
            return ShortenService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
