package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend", v = 1)
public final class hm9 extends p6a implements ci4<t78, r02<? super Boolean>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ Set<String> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm9(Set<String> set, r02<? super hm9> r02Var) {
        super(2, r02Var);
        this.u = set;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        hm9 hm9Var = new hm9(this.u, r02Var);
        hm9Var.t = obj;
        return hm9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t78 t78Var, r02<? super Boolean> r02Var) {
        return ((hm9) create(t78Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        Set<t78.a<?>> setKeySet = ((t78) this.t).a().keySet();
        ArrayList arrayList = new ArrayList(ph1.n(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((t78.a) it.next()).a);
        }
        LinkedHashSet linkedHashSet = im9.a;
        boolean z = true;
        Set<String> set = this.u;
        if (set != linkedHashSet) {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
