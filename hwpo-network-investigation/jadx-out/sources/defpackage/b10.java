package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.intercom.android.sdk.AppIdentityInjector;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b10 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ b10(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return AppIdentityInjector.legacyRetrofit_delegate$lambda$7((AppIdentityInjector) obj);
            case 1:
                return MessageComposerKt.MessageComposer$lambda$66$lambda$44$lambda$43((mh4) obj);
            case 2:
                return ((Context) obj).getSharedPreferences("com.hwpo_training_app.notification_permission.SHARED_PREF_KEY", 0);
            case 3:
                ey7.a aVar = ey7.Companion;
                ey7.b bVar = new ey7.b(1, ((ey7) obj).w(), ny7.class, "onCountryClicked", "onCountryClicked(Lcom/hwpo_training_app/country/presentation/entity/CountryUiEntity;)V", 0);
                c82 c82Var = new c82(new c82.a());
                c82Var.d.b(new e93(new f82(), new i82(3), new ge(1, bVar), j82.u));
                return c82Var;
            case 4:
                ((yv) obj).y = false;
                return g2b.a;
            default:
                return new LinearLayoutManager(((slb) obj).u.getContext(), 0, false);
        }
    }
}
