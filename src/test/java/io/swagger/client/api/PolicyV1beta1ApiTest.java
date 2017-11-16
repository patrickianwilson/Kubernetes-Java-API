/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.7.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1Patch;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1Status;
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1WatchEvent;
import io.swagger.client.model.IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget;
import io.swagger.client.model.IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PolicyV1beta1Api
 */
@Ignore
public class PolicyV1beta1ApiTest {

    private final PolicyV1beta1Api api = new PolicyV1beta1Api();

    
    /**
     * 
     *
     * create a PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPolicyV1beta1NamespacedPodDisruptionBudgetTest() throws ApiException {
        String namespace = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget body = null;
        String pretty = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget response = api.createPolicyV1beta1NamespacedPodDisruptionBudget(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePolicyV1beta1CollectionNamespacedPodDisruptionBudgetTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deletePolicyV1beta1CollectionNamespacedPodDisruptionBudget(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePolicyV1beta1NamespacedPodDisruptionBudgetTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deletePolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPolicyV1beta1APIResourcesTest() throws ApiException {
        IoK8sApimachineryPkgApisMetaV1APIResourceList response = api.getPolicyV1beta1APIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPolicyV1beta1NamespacedPodDisruptionBudgetTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetList response = api.listPolicyV1beta1NamespacedPodDisruptionBudget(namespace, pretty, fieldSelector, includeUninitialized, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPolicyV1beta1PodDisruptionBudgetForAllNamespacesTest() throws ApiException {
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudgetList response = api.listPolicyV1beta1PodDisruptionBudgetForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPolicyV1beta1NamespacedPodDisruptionBudgetTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget response = api.patchPolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPolicyV1beta1NamespacedPodDisruptionBudgetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget response = api.patchPolicyV1beta1NamespacedPodDisruptionBudgetStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPolicyV1beta1NamespacedPodDisruptionBudgetTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget response = api.readPolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPolicyV1beta1NamespacedPodDisruptionBudgetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget response = api.readPolicyV1beta1NamespacedPodDisruptionBudgetStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replacePolicyV1beta1NamespacedPodDisruptionBudgetTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget body = null;
        String pretty = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget response = api.replacePolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replacePolicyV1beta1NamespacedPodDisruptionBudgetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget body = null;
        String pretty = null;
        IoK8sKubernetesPkgApisPolicyV1beta1PodDisruptionBudget response = api.replacePolicyV1beta1NamespacedPodDisruptionBudgetStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch changes to an object of kind PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchPolicyV1beta1NamespacedPodDisruptionBudgetTest() throws ApiException {
        String name = null;
        String namespace = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchPolicyV1beta1NamespacedPodDisruptionBudget(name, namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchPolicyV1beta1NamespacedPodDisruptionBudgetListTest() throws ApiException {
        String namespace = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchPolicyV1beta1NamespacedPodDisruptionBudgetList(namespace, fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchPolicyV1beta1PodDisruptionBudgetListForAllNamespacesTest() throws ApiException {
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchPolicyV1beta1PodDisruptionBudgetListForAllNamespaces(fieldSelector, includeUninitialized, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
}