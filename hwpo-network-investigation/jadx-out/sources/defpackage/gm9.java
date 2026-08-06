package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend", v = 1)
public final class gm9 extends p6a implements ei4<mm9, t78, r02<? super t78>, Object> {
    public /* synthetic */ mm9 t;
    public /* synthetic */ t78 u;

    @Override // defpackage.ei4
    public final Object invoke(mm9 mm9Var, t78 t78Var, r02<? super t78> r02Var) {
        gm9 gm9Var = new gm9(3, r02Var);
        gm9Var.t = mm9Var;
        gm9Var.u = t78Var;
        return gm9Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        mm9 mm9Var = this.t;
        t78 t78Var = this.u;
        Set<t78.a<?>> setKeySet = t78Var.a().keySet();
        ArrayList arrayList = new ArrayList(ph1.n(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((t78.a) it.next()).a);
        }
        Map<String, ?> all = mm9Var.a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = mm9Var.b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(pi6.g(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = th1.X((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry3.getKey())) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        x27 x27VarC = t78Var.c();
        for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
            String str = (String) entry4.getKey();
            Object value2 = entry4.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                x27VarC.h(new t78.a<>(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                x27VarC.h(new t78.a<>(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                x27VarC.h(new t78.a<>(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                x27VarC.h(new t78.a<>(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                x27VarC.h(new t78.a<>(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                x27VarC.h(new t78.a<>(str), (Set) value2);
            }
        }
        return x27VarC.d();
    }
}
