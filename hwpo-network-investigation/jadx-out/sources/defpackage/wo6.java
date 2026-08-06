package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.hwpo_library.presentation.MediaLibraryDialog$initListeners$1$1", f = "MediaLibraryDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wo6 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ vo6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo6(vo6 vo6Var, r02<? super wo6> r02Var) {
        super(3, r02Var);
        this.t = vo6Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new wo6(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        vo6.a aVar = vo6.Companion;
        ip6 ip6VarW = this.t.w();
        ArrayList arrayList = new ArrayList(ip6VarW.b().e);
        ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((x60) obj2).a(false));
        }
        ip6VarW.e(new ip6.a.C0179a(arrayList2));
        return g2b.a;
    }
}
