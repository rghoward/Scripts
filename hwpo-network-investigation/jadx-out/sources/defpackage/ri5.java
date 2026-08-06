package defpackage;

import android.os.Bundle;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ri5 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ri5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7$lambda$3$lambda$2((mh4) obj);
            case 1:
                return da8.b(((aa8) obj).a);
            default:
                bf9 bf9Var = (bf9) obj;
                mg9 mg9Var = bf9Var.A;
                if (mg9Var == null) {
                    xj5.e("viewModelFactory");
                    throw null;
                }
                Bundle bundleRequireArguments = bf9Var.requireArguments();
                bundleRequireArguments.getClass();
                whb parentFragment = bf9Var.getParentFragment();
                iy8 iy8Var = parentFragment instanceof iy8 ? (iy8) parentFragment : null;
                mg9Var.u = iy8Var != null ? iy8Var.e() : null;
                mg9Var.v = bundleRequireArguments.getInt("PROGRAM_ID_KEY", -1);
                mg9Var.w = bundleRequireArguments.getInt("SESSION_ID_KEY", -1);
                String string = bundleRequireArguments.getString("SESSION_TITLE_KEY", BuildConfig.FLAVOR);
                string.getClass();
                mg9Var.x = string;
                return mg9Var;
        }
    }
}
