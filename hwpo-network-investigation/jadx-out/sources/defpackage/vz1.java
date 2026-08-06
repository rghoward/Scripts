package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class vz1 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
            return (i & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, vz1.c(context), null) : context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i);
        }
    }

    public static int a(Context context, String str) {
        if (str == null) {
            ac4.c("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new cd7(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static ColorStateList b(Context context, int i) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        iu8.a aVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        iu8.b bVar = new iu8.b(resources, theme);
        synchronized (iu8.c) {
            try {
                SparseArray<iu8.a> sparseArray = iu8.b.get(bVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (aVar.b.equals(resources.getConfiguration())) {
                        if (theme != null || aVar.c != 0) {
                            if (theme == null || aVar.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = aVar.a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = iu8.a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListA = ti1.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (iu8.c) {
            try {
                WeakHashMap<iu8.b, SparseArray<iu8.a>> weakHashMap = iu8.b;
                SparseArray<iu8.a> sparseArray2 = weakHashMap.get(bVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(bVar, sparseArray2);
                }
                sparseArray2.append(i, new iu8.a(colorStateListA, bVar.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static String c(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (ty.b(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (ty.b(context, str) == 0) {
                return str;
            }
        }
        ru3.d(sk0.c("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        return null;
    }

    public static Intent d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            z90.a("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i2 != 0 && (i & 4) != 0) {
            z90.a("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            return b.a(context, broadcastReceiver, intentFilter, i);
        }
        if (i3 >= 26) {
            return a.a(context, broadcastReceiver, intentFilter, i);
        }
        return (i & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, c(context), null) : context.registerReceiver(broadcastReceiver, intentFilter, null, null);
    }
}
