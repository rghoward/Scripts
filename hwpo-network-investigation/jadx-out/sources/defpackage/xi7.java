package defpackage;

import com.hwpo_training_app.settings.presentation.view.AccountSettingsView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xi7 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ xi7(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((AccountSettingsView) ((ti7) obj2).receiver).setWeightUnits((zlb) obj);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                u38 u38Var = (u38) obj2;
                u38.a aVar = u38.Companion;
                u38Var.p().b.setVisibility(zBooleanValue ? 0 : 8);
                u38Var.p().d.setUseController(!zBooleanValue);
                break;
        }
        return g2b.a;
    }
}
