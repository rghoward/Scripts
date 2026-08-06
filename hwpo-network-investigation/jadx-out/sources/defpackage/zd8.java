package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zd8 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ zd8(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                gp5.b bVar = (gp5.b) obj;
                bVar.a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                bVar.a(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS, fValueOf).b = zy6.b;
                bVar.a(1500, fValueOf);
                Float fValueOf2 = Float.valueOf(180.0f);
                bVar.a(1800, fValueOf2);
                bVar.a(3000, fValueOf2);
                Float fValueOf3 = Float.valueOf(270.0f);
                bVar.a(3300, fValueOf3);
                bVar.a(4500, fValueOf3);
                Float fValueOf4 = Float.valueOf(360.0f);
                bVar.a(4800, fValueOf4);
                bVar.a(6000, fValueOf4);
                return g2b.a;
            default:
                return SurveyComponentKt.SurveyComponent$lambda$3$lambda$2((SurveyState.Content.SecondaryCta) obj);
        }
    }
}
