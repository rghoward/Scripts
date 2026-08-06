package io.intercom.android.sdk.api;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class DeDuper {
    private static final String CUSTOM_ATTRIBUTES = "custom_attributes";
    private static final String EMPTY_JSON = "{}";
    private final Provider<AppConfig> appConfigProvider;
    private final DeDuperStore store;
    private final Map<String, Object> cachedAttributes = new HashMap();
    private final Gson gson = new Gson();
    private long earliestUpdateAt = 0;

    public DeDuper(Provider<AppConfig> provider, DeDuperStore deDuperStore) {
        this.appConfigProvider = provider;
        this.store = deDuperStore;
    }

    private static boolean containsOnlyEmptyCustomAttributes(Map<String, Object> map) {
        return map.size() == 1 && Collections.EMPTY_MAP.equals(map.get(CUSTOM_ATTRIBUTES));
    }

    private static Map<String, Object> getCustomAttributes(Map<String, ?> map) {
        Object obj = map.get(CUSTOM_ATTRIBUTES);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    private boolean hasExpiredCache() {
        if (this.earliestUpdateAt == 0) {
            return false;
        }
        return TimeProvider.SYSTEM.currentTimeMillis() - this.earliestUpdateAt > this.appConfigProvider.get().getUserUpdateCacheMaxAgeMs();
    }

    private boolean hasNewAttributeValues(Map<String, Object> map) {
        Object value;
        Map<String, Object> customAttributes = getCustomAttributes(this.cachedAttributes);
        Map<String, Object> customAttributes2 = getCustomAttributes(map);
        if (customAttributes2 != null) {
            if (customAttributes == null) {
                return true;
            }
            for (Map.Entry<String, Object> entry : customAttributes2.entrySet()) {
                Object value2 = entry.getValue();
                if (value2 != null && !value2.equals(customAttributes.get(entry.getKey()))) {
                    return true;
                }
            }
        }
        for (Map.Entry<String, Object> entry2 : map.entrySet()) {
            if (!CUSTOM_ATTRIBUTES.equals(entry2.getKey()) && (value = entry2.getValue()) != null && !value.equals(this.cachedAttributes.get(entry2.getKey()))) {
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty() {
        return this.cachedAttributes.isEmpty();
    }

    private static Map<String, Object> mergeMaps(Map<String, ?> map, Map<String, ?> map2) {
        HashMap map3 = new HashMap(map);
        map3.putAll(map2);
        return map3;
    }

    private void persistCachedAttributes() {
        this.store.save(this.gson.toJson(new HashMap(this.cachedAttributes)), this.earliestUpdateAt);
    }

    public long getEarliestUpdateAt() {
        return this.earliestUpdateAt;
    }

    public Map<String, Object> getMap() {
        return this.cachedAttributes;
    }

    public synchronized void readPersistedCachedAttributes() {
        String cachedAttributes = this.store.getCachedAttributes();
        long earliestUpdateAt = this.store.getEarliestUpdateAt();
        if (!EMPTY_JSON.equals(cachedAttributes) || earliestUpdateAt != 0) {
            try {
                this.cachedAttributes.putAll((Map) this.gson.fromJson(cachedAttributes, Map.class));
                this.earliestUpdateAt = earliestUpdateAt;
            } catch (JsonSyntaxException unused) {
            }
        }
    }

    public synchronized void reset() {
        this.cachedAttributes.clear();
        this.earliestUpdateAt = 0L;
        persistCachedAttributes();
    }

    public void setEarliestUpdateAt(long j) {
        this.earliestUpdateAt = j;
    }

    public synchronized boolean shouldUpdateUser(Map<String, Object> map) {
        if (!map.isEmpty() && !containsOnlyEmptyCustomAttributes(map)) {
            return hasNewAttributeValues(map) || isEmpty() || hasExpiredCache();
        }
        return false;
    }

    public synchronized void update(Map<String, ?> map) {
        try {
            if (hasExpiredCache()) {
                this.cachedAttributes.clear();
                setEarliestUpdateAt(TimeProvider.SYSTEM.currentTimeMillis());
            }
            if (this.earliestUpdateAt == 0) {
                setEarliestUpdateAt(TimeProvider.SYSTEM.currentTimeMillis());
            }
            Map<String, Object> customAttributes = getCustomAttributes(this.cachedAttributes);
            Map<String, Object> customAttributes2 = getCustomAttributes(map);
            this.cachedAttributes.putAll(map);
            if (customAttributes != null && customAttributes2 != null) {
                this.cachedAttributes.put(CUSTOM_ATTRIBUTES, mergeMaps(customAttributes, customAttributes2));
            }
            persistCachedAttributes();
        } catch (Throwable th) {
            throw th;
        }
    }
}
