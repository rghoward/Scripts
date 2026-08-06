package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aa8 implements z98 {
    public final Context a;
    public final o7a b;
    public final int c;
    public final o7a d;
    public final o7a e;
    public boolean f;

    public aa8(Context context, z6b z6bVar) {
        context.getClass();
        z6bVar.getClass();
        this.a = context;
        this.b = new o7a(new up1(3, this));
        this.c = Process.myPid();
        int i = 1;
        this.d = new o7a(new vp1(i, z6bVar));
        this.e = new o7a(new ri5(i, this));
    }

    @Override // defpackage.z98
    public final void a() {
        this.f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z98
    public final boolean b(Map<String, y98> map) {
        map.getClass();
        if (!this.f) {
            ArrayList arrayListA = da8.a(this.a);
            ArrayList arrayList = new ArrayList();
            int size = arrayListA.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListA.get(i);
                i++;
                ca8 ca8Var = (ca8) obj;
                y98 y98Var = map.get(ca8Var.a);
                js7 js7Var = y98Var != null ? new js7(ca8Var, y98Var) : null;
                if (js7Var != null) {
                    arrayList.add(js7Var);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                js7 js7Var2 = (js7) obj2;
                ca8 ca8Var2 = (ca8) js7Var2.t;
                y98 y98Var2 = (y98) js7Var2.u;
                boolean zA = xj5.a(c(), ca8Var2.a);
                int i3 = ca8Var2.b;
                if (zA) {
                    if (i3 != y98Var2.a || !xj5.a((String) this.d.getValue(), y98Var2.b)) {
                    }
                } else if (i3 != y98Var2.a) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.z98
    public final String c() {
        return (String) this.b.getValue();
    }

    @Override // defpackage.z98
    public final boolean d(Map<String, y98> map) {
        map.getClass();
        y98 y98Var = map.get(c());
        return (y98Var != null && y98Var.a == this.c && xj5.a(y98Var.b, (String) this.d.getValue())) ? false : true;
    }

    @Override // defpackage.z98
    public final Map<String, y98> e() {
        return f(if3.t);
    }

    @Override // defpackage.z98
    public final Map<String, y98> f(Map<String, y98> map) {
        o7a o7aVar = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(c(), new y98(Process.myPid(), (String) o7aVar.getValue()));
            return qi6.l(linkedHashMap);
        }
        Map<String, y98> mapSingletonMap = Collections.singletonMap(c(), new y98(Process.myPid(), (String) o7aVar.getValue()));
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
