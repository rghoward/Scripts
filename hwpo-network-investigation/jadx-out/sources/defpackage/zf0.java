package defpackage;

import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.StarRatingKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zf0 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    public /* synthetic */ zf0(int i, int i2) {
        this.t = i2;
        this.u = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        jt1 jt1Var = (jt1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i2 = this.u;
        switch (i) {
            case 0:
                return AvatarIconKt.AvatarIconPreview$lambda$22(i2, jt1Var, iIntValue);
            default:
                return StarRatingKt.UnSelectedStar$lambda$5(i2, jt1Var, iIntValue);
        }
    }
}
