package io.intercom.android.sdk.survey.ui.questiontype.files;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.u30;
import defpackage.ws0;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$UploadFileQuestionKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$UploadFileQuestionKt$lambda2$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$UploadFileQuestionKt$lambda2$1 INSTANCE = new ComposableSingletons$UploadFileQuestionKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(Answer answer) {
        answer.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel = new SurveyData.Step.Question.UploadFileQuestionModel(BuildConfig.FLAVOR, ws0.h(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Attachments")), null, false, 1, u30.F(new String[]{"image/jpeg", "image/png"}), 4, null);
        jt1Var.K(-2065428552);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new h();
            jt1Var.C(objF);
        }
        jt1Var.B();
        UploadFileQuestionKt.UploadFileQuestion(null, uploadFileQuestionModel, null, (oh4) objF, null, null, jt1Var, 3072, 53);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
