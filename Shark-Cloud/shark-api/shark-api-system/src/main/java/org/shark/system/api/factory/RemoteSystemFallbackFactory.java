package org.shark.system.api.factory;

import org.shark.system.api.RemoteSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;

/**
 * @author Acer
 */
public class RemoteSystemFallbackFactory implements FallbackFactory<RemoteSystemService> {
    private static final Logger log = LoggerFactory.getLogger(RemoteSystemFallbackFactory.class);
    @Override
    public RemoteSystemService create(Throwable cause) {
        log.error("远程调用系统服务失败");
        return new RemoteSystemService() {

        };
    }
}
