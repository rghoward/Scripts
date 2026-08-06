package defpackage;

import defpackage.c67;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class d67<D extends c67> {
    public final p87<? extends D> a;
    public final String c;
    public final int b = -1;
    public final LinkedHashMap d = new LinkedHashMap();
    public final ArrayList e = new ArrayList();
    public final LinkedHashMap f = new LinkedHashMap();

    public d67(p87<? extends D> p87Var, String str) {
        this.a = p87Var;
        this.c = str;
    }

    public D a() {
        D d = (D) b();
        d.getClass();
        f67 f67Var = d.u;
        for (Map.Entry entry : this.d.entrySet()) {
            String str = (String) entry.getKey();
            p47 p47Var = (p47) entry.getValue();
            str.getClass();
            p47Var.getClass();
            f67Var.getClass();
            f67Var.c.put(str, p47Var);
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            x57 x57Var = (x57) obj;
            x57Var.getClass();
            f67Var.getClass();
            ArrayList arrayListG = z63.g(f67Var.c, new ao6(1, x57Var));
            if (!arrayListG.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + x57Var.a + " can't be used to open destination " + f67Var.a + ".\nFollowing required arguments are missing: " + arrayListG).toString());
            }
            f67Var.b.add(x57Var);
        }
        for (Map.Entry entry2 : this.f.entrySet()) {
            int iIntValue = ((Number) entry2.getKey()).intValue();
            o47 o47Var = (o47) entry2.getValue();
            o47Var.getClass();
            if (d instanceof h9.a) {
                throw new UnsupportedOperationException("Cannot add action " + iIntValue + " to " + d + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            }
            if (iIntValue == 0) {
                z90.a("Cannot have an action with actionId 0");
                return null;
            }
            d.w.e(iIntValue, o47Var);
        }
        String str2 = this.c;
        if (str2 != null) {
            f67Var.getClass();
            if (z2a.w(str2)) {
                z90.a("Cannot have an empty route");
                return null;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str2);
            ArrayList arrayListG2 = z63.g(f67Var.c, new e67(0, new x57(strConcat)));
            if (!arrayListG2.isEmpty()) {
                StringBuilder sbA = aa.a("Cannot set route \"", str2, "\" for destination ");
                sbA.append(f67Var.a);
                sbA.append(". Following required arguments are missing: ");
                sbA.append(arrayListG2);
                throw new IllegalArgumentException(sbA.toString().toString());
            }
            f67Var.f = new o7a(new bq1(4, strConcat));
            f67Var.d = strConcat.hashCode();
            f67Var.e = str2;
        }
        int i2 = this.b;
        if (i2 != -1) {
            f67Var.d = i2;
        }
        return d;
    }

    public D b() {
        return (D) this.a.a();
    }
}
