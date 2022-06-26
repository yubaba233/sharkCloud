package org.shark.system.api;

import org.shark.system.api.factory.RemoteSystemFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Acer
 */
@FeignClient(contextId = "remoteUserService", value = "shark-system", fallbackFactory = RemoteSystemFallbackFactory.class)
public interface RemoteSystemService {

}
