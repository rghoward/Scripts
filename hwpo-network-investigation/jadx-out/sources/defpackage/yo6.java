package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.hwpo_library.presentation.MediaLibraryDialog$initListeners$1$3", f = "MediaLibraryDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yo6 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ vo6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo6(vo6 vo6Var, r02<? super yo6> r02Var) {
        super(3, r02Var);
        this.t = vo6Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new yo6(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        vo6.a aVar = vo6.Companion;
        ip6 ip6VarW = this.t.w();
        ArrayList arrayList = new ArrayList();
        List<x60> list = ip6VarW.b().e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((x60) obj2).d()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(ph1.n(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList2.get(i);
            i++;
            m89 m89VarC = ((x60) obj3).c();
            long j = m89VarC.a;
            String str = m89VarC.b;
            u60 u60Var = m89VarC.j;
            String str2 = m89VarC.c;
            arrayList3.add(new t60(j, str, u60Var, str2, m89VarC.g, m89VarC.d, m89VarC.f, m89VarC.k, m89VarC.l, z2a.N(str2, ".")));
            arrayList2 = arrayList2;
        }
        arrayList.addAll(arrayList3);
        ip6VarW.f(new bp6.b(arrayList));
        return g2b.a;
    }
}
