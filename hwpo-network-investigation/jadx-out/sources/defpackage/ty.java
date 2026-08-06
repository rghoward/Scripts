package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ty {
    public static final gi1 a = gi1.K;
    public static final gi1 b;
    public static final gi1 c;
    public static final gi1 d;
    public static final gi1 e;
    public static final gi1 f;
    public static final dj4 g;

    static {
        gi1 gi1Var = gi1.A;
        b = gi1Var;
        c = gi1.L;
        gi1 gi1Var2 = gi1.B;
        d = gi1Var2;
        e = gi1Var;
        f = gi1Var2;
        g = new dj4();
    }

    public static final void a(ArrayList arrayList, int i, int i2) {
        int iD = d(i, arrayList);
        if (iD < 0) {
            iD = -(iD + 1);
        }
        while (iD < arrayList.size() && ((kk5) arrayList.get(iD)).b < i2) {
        }
    }

    public static int b(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, z10.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final void c(yr9 yr9Var, ArrayList arrayList, int i) {
        boolean zL = yr9Var.l(i);
        int[] iArr = yr9Var.b;
        if (zL) {
            arrayList.add(yr9Var.n(i));
            return;
        }
        int iA = bs9.a(iArr, i) + i;
        for (int i2 = i + 1; i2 < iA; i2 += iArr[(i2 * 5) + 3]) {
            c(yr9Var, arrayList, i2);
        }
    }

    public static final int d(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iB = xj5.b(((kk5) list.get(i3)).b, i);
            if (iB < 0) {
                i2 = i3 + 1;
            } else {
                if (iB <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final whb e(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            whb whbVar = tag instanceof whb ? (whb) tag : null;
            if (whbVar != null) {
                return whbVar;
            }
            Object objG = bza.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return null;
    }

    public static final void f(cs9 cs9Var, int i, Object obj) {
        int iH = cs9Var.h(i);
        Object[] objArr = cs9Var.c;
        Object obj2 = objArr[iH];
        objArr[iH] = jt1.a.a;
        if (obj == obj2) {
            return;
        }
        pt1.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
