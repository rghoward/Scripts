package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class da8 {
    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = hf3.t;
        }
        ArrayList arrayListW = th1.w(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = arrayListW.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListW.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new ca8(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, xj5.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static ca8 b(Context context) {
        Object obj;
        String strA;
        context.getClass();
        int iMyPid = Process.myPid();
        ArrayList arrayListA = a(context);
        int size = arrayListA.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayListA.get(i);
            i++;
        } while (((ca8) obj).b != iMyPid);
        ca8 ca8Var = (ca8) obj;
        if (ca8Var != null) {
            return ca8Var;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            strA = Process.myProcessName();
            strA.getClass();
        } else if ((i2 < 28 || (strA = Application.getProcessName()) == null) && (strA = na8.a()) == null) {
            strA = BuildConfig.FLAVOR;
        }
        return new ca8(iMyPid, 0, strA, false);
    }
}
