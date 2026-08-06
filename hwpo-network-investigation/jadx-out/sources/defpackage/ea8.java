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
public final class ea8 {
    public static final ea8 a = new ea8();

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
            rd0.a aVar = new rd0.a();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                ac4.c("Null processName");
                return null;
            }
            aVar.a = str2;
            aVar.b = runningAppProcessInfo.pid;
            byte b = (byte) (aVar.e | 1);
            aVar.c = runningAppProcessInfo.importance;
            aVar.e = (byte) (b | 2);
            aVar.d = xj5.a(str2, str);
            aVar.e = (byte) (aVar.e | 4);
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public final u92.e.d.a.c b(Context context) {
        Object obj;
        String processName;
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
        } while (((u92.e.d.a.c) obj).b() != iMyPid);
        u92.e.d.a.c cVar = (u92.e.d.a.c) obj;
        if (cVar != null) {
            return cVar;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else if (i2 < 28 || (processName = Application.getProcessName()) == null) {
            processName = BuildConfig.FLAVOR;
        }
        rd0.a aVar = new rd0.a();
        aVar.a = processName;
        aVar.b = iMyPid;
        byte b = (byte) (aVar.e | 1);
        aVar.c = 0;
        aVar.d = false;
        aVar.e = (byte) (((byte) (b | 2)) | 4);
        return aVar.a();
    }
}
