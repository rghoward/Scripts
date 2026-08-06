package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xn9 {
    public static volatile wn9<?> a;
    public static volatile ArrayList b;

    public static ArrayList a(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            try {
                c(context).getClass();
                return new ArrayList();
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new vn9.b(context, it.next()).a());
        }
        return arrayList;
    }

    public static List<un9> b(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((un9) Class.forName(string, false, xn9.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static wn9<?> c(Context context) {
        if (a == null) {
            try {
                a = (wn9) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, xn9.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new wn9.a();
            }
        }
        return a;
    }

    public static List d(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return vn9.a(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(8));
        }
        if (i < 25) {
            return Collections.EMPTY_LIST;
        }
        return vn9.a(context, new ArrayList());
    }

    public static void e(Context context, vn9 vn9Var) {
        IconCompat iconCompat;
        int i;
        InputStream inputStreamG;
        Bitmap bitmapDecodeStream;
        IconCompat iconCompatB;
        int i2 = Build.VERSION.SDK_INT;
        int maxShortcutCountPerActivity = i2 >= 25 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity() : 5;
        if (maxShortcutCountPerActivity == 0) {
            return;
        }
        if (i2 <= 29 && (iconCompat = vn9Var.h) != null && (((i = iconCompat.a) == 6 || i == 4) && (inputStreamG = iconCompat.g(context)) != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamG)) != null)) {
            if (i == 6) {
                iconCompatB = new IconCompat(5);
                iconCompatB.b = bitmapDecodeStream;
            } else {
                iconCompatB = IconCompat.b(bitmapDecodeStream);
            }
            vn9Var.h = iconCompatB;
        }
        String str = null;
        int i3 = -1;
        int i4 = 0;
        if (i2 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(vn9Var.b());
        } else if (i2 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                String id = null;
                int rank = -1;
                for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                    if (shortcutInfo.getRank() > rank) {
                        id = shortcutInfo.getId();
                        rank = shortcutInfo.getRank();
                    }
                }
                shortcutManager.removeDynamicShortcuts(Arrays.asList(id));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(vn9Var.b()));
        }
        try {
            c(context).getClass();
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() >= maxShortcutCountPerActivity) {
                String[] strArr = new String[1];
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    vn9 vn9Var2 = (vn9) obj;
                    int i6 = vn9Var2.m;
                    if (i6 > i3) {
                        str = vn9Var2.b;
                        i3 = i6;
                    }
                }
                strArr[0] = str;
                Arrays.asList(strArr);
            }
            Arrays.asList(vn9Var);
        } catch (Exception unused) {
        } finally {
            ArrayList arrayList2 = (ArrayList) b(context);
            int size2 = arrayList2.size();
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                Collections.singletonList(vn9Var);
                ((un9) obj2).getClass();
            }
            g(context, vn9Var.b);
        }
    }

    public static void f(Context context, List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            rk.a(context.getSystemService(qk.b())).removeDynamicShortcuts(list);
        }
        c(context).getClass();
        ArrayList arrayList = (ArrayList) b(context);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((un9) obj).getClass();
        }
    }

    public static void g(Context context, String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            rk.a(context.getSystemService(qk.b())).reportShortcutUsed(str);
        }
        ArrayList arrayList = (ArrayList) b(context);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Collections.singletonList(str);
            ((un9) obj).getClass();
        }
    }

    public static void h(Context context, List list) {
        if (Build.VERSION.SDK_INT <= 32) {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((vn9) it.next()).getClass();
            }
            list = arrayList;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList2 = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((vn9) it2.next()).b());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList2)) {
                return;
            }
        }
        c(context).getClass();
        c(context).getClass();
        ArrayList arrayList3 = (ArrayList) b(context);
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            ((un9) obj).getClass();
        }
    }
}
