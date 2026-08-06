package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ld2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ld2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                nd2 nd2Var = (nd2) obj;
                return new ColorStateList(new int[][]{new int[]{-16842913}, new int[]{R.attr.state_selected}}, new int[]{nd2Var.getContext().getColor(com.hwpo_training_app.R.color.controlNormal), nd2Var.getContext().getColor(com.hwpo_training_app.R.color.buttonPrimaryBackground)});
            case 1:
                fi3 fi3Var = (fi3) obj;
                fi3.a aVar = fi3.Companion;
                return new iw3(new fi3.b(1, fi3Var.r(), fj3.class, "onAttachmentActionClick", "onAttachmentActionClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)Lkotlinx/coroutines/Job;", 8), new fi3.c(1, fi3Var.r(), fj3.class, "onUploadingActionClick", "onUploadingActionClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)Lkotlinx/coroutines/Job;", 8));
            case 2:
                Bitmap.Config[] configArr = v.a;
                File cacheDir = ((Context) obj).getCacheDir();
                if (cacheDir != null) {
                    cacheDir.mkdirs();
                    return cacheDir;
                }
                aa0.c("cacheDir == null");
                return null;
            default:
                return ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$7$lambda$6((mh4) obj);
        }
    }
}
