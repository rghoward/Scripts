package io.ably.lib.objects;

import io.ably.lib.realtime.AblyRealtime;
import io.ably.lib.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ObjectsHelper {
    private static final String TAG = "io.ably.lib.objects.ObjectsHelper";
    private static volatile ObjectsSerializer objectsSerializer;

    public static ObjectsSerializer getSerializer() {
        if (objectsSerializer == null) {
            synchronized (ObjectsHelper.class) {
                if (objectsSerializer == null) {
                    try {
                        objectsSerializer = (ObjectsSerializer) Class.forName("io.ably.lib.objects.serialization.DefaultObjectsSerializer").getDeclaredConstructor(null).newInstance(null);
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        Log.w(TAG, "Failed to init ObjectsSerializer, LiveObjects plugin not included in the classpath", e);
                        return null;
                    }
                }
            }
        }
        return objectsSerializer;
    }

    public static LiveObjectsPlugin tryInitializeObjectsPlugin(AblyRealtime ablyRealtime) {
        try {
            return (LiveObjectsPlugin) Class.forName("io.ably.lib.objects.DefaultLiveObjectsPlugin").getDeclaredConstructor(ObjectsAdapter.class).newInstance(new Adapter(ablyRealtime));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            Log.i(TAG, "LiveObjects plugin not found in classpath. LiveObjects functionality will not be available.", e);
            return null;
        }
    }
}
