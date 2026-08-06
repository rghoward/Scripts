package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.add_value.AddValueViewModel", f = "AddValueViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION, 186}, m = "requestValues", v = 2)
public final class nd extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ gd u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(gd gdVar, u02 u02Var) {
        super(u02Var);
        this.u = gdVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return gd.g(this.u, null, this);
    }
}
