import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CoreV1Api;
import io.swagger.client.model.IoK8sKubernetesPkgApiV1Namespace;
import io.swagger.client.model.IoK8sKubernetesPkgApiV1NamespaceList;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by pwilson on 11/15/17.
 */
public class NamespaceTest {

    @Test
    public void testItOut() throws ApiException, FileNotFoundException {
        ApiClient client = new ApiClient();
        client.setBasePath("https://35.188.205.86");
        client.setUsername("admin");
        client.setPassword("9eUHzUmcpbGf4dd8");
        client.setSslCaCert(new FileInputStream("/home/pwilson/temp/creds/playground.cert"));  //pem cert file with any spaces removed and a newline right after ----BEGIN CERTIFICATE----
//        StorageV1Api storage = new StorageV1Api(client);
//        IoK8sApimachineryPkgApisMetaV1APIResourceList resp = storage.getStorageV1APIResources();

        IoK8sKubernetesPkgApiV1NamespaceList nsResp = new CoreV1Api(client).listCoreV1Namespace("true", null, true, null, null, null, false);

        for (IoK8sKubernetesPkgApiV1Namespace ioK8sKubernetesPkgApiV1Namespace : nsResp.getItems()) {
            System.out.println(ioK8sKubernetesPkgApiV1Namespace.getMetadata().getName());
        }
    }
}

