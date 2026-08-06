package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qk;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.we1;
import defpackage.xj5;
import defpackage.xj8;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiQuestionKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class EmojiQuestionKt {
    public static final void EmojiQuestion(final List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption> list, final Answer answer, final oh4<? super Answer, g2b> oh4Var, jt1 jt1Var, final int i) {
        list.getClass();
        answer.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(1738433356);
        int i2 = (i & 6) == 0 ? (bj4VarO.j(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(answer) ? 32 : 16;
        }
        int i3 = 256;
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = ir9.c(aVar, 1.0f);
            ny8 ny8VarA = ly8.a(new c30.h(12.0f, false, new qk()), di.a.k, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            bj4VarO.K(-1487440982);
            for (final SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption emojiRatingOption : list) {
                boolean z = (answer instanceof Answer.SingleAnswer) && xj5.a(((Answer.SingleAnswer) answer).getAnswer(), String.valueOf(emojiRatingOption.getValue()));
                String emojiUrl = emojiRatingOption.getEmojiUrl();
                String unicode = emojiRatingOption.getUnicode();
                boolean z2 = (answer instanceof Answer.NoAnswer) || z;
                ox6 ox6VarJ = ir9.j(aVar, z ? 34.0f : 32.0f);
                bj4VarO.K(1945180755);
                boolean zJ = ((i2 & 896) == i3) | bj4VarO.J(emojiRatingOption);
                Object objF = bj4VarO.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new mh4() { // from class: qe3
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return EmojiQuestionKt.EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0(oh4Var, emojiRatingOption);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                EmojiRatingKt.EmojiRating(emojiUrl, unicode, z2, we1.c(ox6VarJ, false, null, (mh4) objF, 15), bj4VarO, 0, 0);
                i3 = 256;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: re3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return EmojiQuestionKt.EmojiQuestion$lambda$4(list, answer, oh4Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0(oh4 oh4Var, SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption emojiRatingOption) {
        oh4Var.invoke(new Answer.SingleAnswer(String.valueOf(emojiRatingOption.getValue())));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmojiQuestion$lambda$4(List list, Answer answer, oh4 oh4Var, int i, jt1 jt1Var, int i2) {
        EmojiQuestion(list, answer, oh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
