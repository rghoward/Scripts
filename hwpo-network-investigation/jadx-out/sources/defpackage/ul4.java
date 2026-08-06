package defpackage;

import android.graphics.Bitmap;
import android.graphics.Movie;
import android.graphics.Picture;
import io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ul4 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ul4(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    @Override // defpackage.mh4
    public final Object invoke() throws IOException {
        Bitmap.Config config;
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                vl4 vl4Var = (vl4) obj;
                m85 m85Var = vl4Var.a;
                zk7 zk7Var = vl4Var.b;
                ni8 ni8Var = new ni8(new ch4(m85Var.p()));
                try {
                    Movie movieDecodeStream = Movie.decodeStream(ni8Var.r0());
                    ni8Var.close();
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        aa0.c("Failed to decode GIF.");
                        return null;
                    }
                    if (movieDecodeStream.isOpaque() && zk7Var.g) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = j.a(zk7Var.b) ? Bitmap.Config.ARGB_8888 : zk7Var.b;
                    }
                    s39 s39Var = zk7Var.e;
                    ys7 ys7Var = zk7Var.l;
                    oz6 oz6Var = new oz6(movieDecodeStream, config, s39Var);
                    Integer num = (Integer) ys7Var.d("coil#repeat_count");
                    int iIntValue = num != null ? num.intValue() : -1;
                    if (iIntValue < -1) {
                        ca0.a(pp2.a(iIntValue, "Invalid repeatCount: "));
                        return null;
                    }
                    oz6Var.J = iIntValue;
                    mh4 mh4Var = (mh4) ys7Var.d("coil#animation_start_callback");
                    mh4 mh4Var2 = (mh4) ys7Var.d("coil#animation_end_callback");
                    if (mh4Var != null || mh4Var2 != null) {
                        oz6Var.x.add(new i(mh4Var, mh4Var2));
                    }
                    xu xuVar = (xu) ys7Var.d("coil#animated_transformation");
                    if (xuVar != null) {
                        Movie movie = oz6Var.t;
                        if (movie.width() <= 0 || movie.height() <= 0) {
                            oz6Var.K = null;
                            oz6Var.L = gz7.t;
                            oz6Var.M = false;
                        } else {
                            Picture picture = new Picture();
                            oz6Var.L = xuVar.transform(picture.beginRecording(movie.width(), movie.height()));
                            picture.endRecording();
                            oz6Var.K = picture;
                            oz6Var.M = true;
                        }
                    } else {
                        oz6Var.K = null;
                        oz6Var.L = gz7.t;
                        oz6Var.M = false;
                    }
                    oz6Var.invalidateSelf();
                    return new in2(oz6Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fg1.a(ni8Var, th);
                        throw th2;
                    }
                }
            default:
                return Float.valueOf(SurveyTopBarComponentKt.SurveyTopBar$lambda$8$lambda$7$lambda$4$lambda$3((yz9) obj));
        }
    }
}
