package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.dc1;
import defpackage.di;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.ph1;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.v5a;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.preview.ui.MediaPickerButtonCTAStyle;
import io.intercom.android.sdk.m5.preview.ui.MediaPickerButtonKt;
import io.intercom.android.sdk.m5.preview.ui.MediaType;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadFileQuestionKt {
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x013e  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void UploadFileQuestion(ox6 ox6Var, final SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel, Answer answer, final oh4<? super Answer, g2b> oh4Var, oh4<? super AnswerClickData, g2b> oh4Var2, ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel2;
        Answer answer2;
        oh4<? super Answer, g2b> oh4Var3;
        int i4;
        int i5;
        oh4<? super AnswerClickData, g2b> oh4Var4;
        int i6;
        int i7;
        ci4<? super jt1, ? super Integer, g2b> ci4VarM489getLambda1$intercom_sdk_base_release;
        int i8;
        final ox6 ox6Var3;
        Answer answer3;
        oh4<? super AnswerClickData, g2b> oh4Var5;
        bj4 bj4Var;
        final oh4<? super AnswerClickData, g2b> oh4Var6;
        final ci4<? super jt1, ? super Integer, g2b> ci4Var2;
        final Answer answer4;
        Object objF;
        xj8 xj8VarW;
        uploadFileQuestionModel.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(1688907441);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            uploadFileQuestionModel2 = uploadFileQuestionModel;
        } else {
            uploadFileQuestionModel2 = uploadFileQuestionModel;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.j(uploadFileQuestionModel2) ? 32 : 16;
            }
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                answer2 = answer;
                i3 |= bj4VarO.J(answer2) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
                oh4Var3 = oh4Var;
            } else {
                oh4Var3 = oh4Var;
                if ((i & 3072) == 0) {
                    if (bj4VarO.j(oh4Var3)) {
                        i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i4 = 1024;
                    }
                    i3 |= i4;
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    if ((196608 & i) == 0) {
                        ci4VarM489getLambda1$intercom_sdk_base_release = ci4Var;
                        if (bj4VarO.j(ci4VarM489getLambda1$intercom_sdk_base_release)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 74899) == 74898 || !bj4VarO.r()) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i10 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i5 != 0) {
                            bj4VarO.K(573866320);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new dc1(1);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var5 = (oh4) objF;
                        } else {
                            oh4Var5 = oh4Var4;
                        }
                        if (i7 != 0) {
                            ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                        }
                        bj4Var = bj4VarO;
                        v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                        oh4Var6 = oh4Var5;
                        ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                        answer4 = answer3;
                    } else {
                        bj4VarO.u();
                        bj4Var = bj4VarO;
                        ox6Var3 = ox6Var2;
                        answer4 = answer2;
                        oh4Var6 = oh4Var4;
                        ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: g4b
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return UploadFileQuestionKt.UploadFileQuestion$lambda$2(ox6Var3, uploadFileQuestionModel, answer4, oh4Var, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                ci4VarM489getLambda1$intercom_sdk_base_release = ci4Var;
                if ((i3 & 74899) == 74898) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i5 != 0) {
                        bj4VarO.K(573866320);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new dc1(1);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF;
                    } else {
                        oh4Var5 = oh4Var4;
                    }
                    if (i7 != 0) {
                        ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                    }
                    bj4Var = bj4VarO;
                    v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                    oh4Var6 = oh4Var5;
                    ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                    answer4 = answer3;
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i5 != 0) {
                        bj4VarO.K(573866320);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new dc1(1);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF;
                    } else {
                        oh4Var5 = oh4Var4;
                    }
                    if (i7 != 0) {
                        ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                    }
                    bj4Var = bj4VarO;
                    v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                    oh4Var6 = oh4Var5;
                    ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                    answer4 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: g4b
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return UploadFileQuestionKt.UploadFileQuestion$lambda$2(ox6Var3, uploadFileQuestionModel, answer4, oh4Var, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var4 = oh4Var2;
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((196608 & i) == 0) {
                    ci4VarM489getLambda1$intercom_sdk_base_release = ci4Var;
                    if (bj4VarO.j(ci4VarM489getLambda1$intercom_sdk_base_release)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i3 & 74899) == 74898) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i5 != 0) {
                        bj4VarO.K(573866320);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new dc1(1);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF;
                    } else {
                        oh4Var5 = oh4Var4;
                    }
                    if (i7 != 0) {
                        ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                    }
                    bj4Var = bj4VarO;
                    v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                    oh4Var6 = oh4Var5;
                    ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                    answer4 = answer3;
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i5 != 0) {
                        bj4VarO.K(573866320);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new dc1(1);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF;
                    } else {
                        oh4Var5 = oh4Var4;
                    }
                    if (i7 != 0) {
                        ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                    }
                    bj4Var = bj4VarO;
                    v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                    oh4Var6 = oh4Var5;
                    ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                    answer4 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: g4b
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return UploadFileQuestionKt.UploadFileQuestion$lambda$2(ox6Var3, uploadFileQuestionModel, answer4, oh4Var, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ci4VarM489getLambda1$intercom_sdk_base_release = ci4Var;
            if ((i3 & 74899) == 74898) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i5 != 0) {
                    bj4VarO.K(573866320);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new dc1(1);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF;
                } else {
                    oh4Var5 = oh4Var4;
                }
                if (i7 != 0) {
                    ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                }
                bj4Var = bj4VarO;
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                oh4Var6 = oh4Var5;
                ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                answer4 = answer3;
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i5 != 0) {
                    bj4VarO.K(573866320);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new dc1(1);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF;
                } else {
                    oh4Var5 = oh4Var4;
                }
                if (i7 != 0) {
                    ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                }
                bj4Var = bj4VarO;
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                oh4Var6 = oh4Var5;
                ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                answer4 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: g4b
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return UploadFileQuestionKt.UploadFileQuestion$lambda$2(ox6Var3, uploadFileQuestionModel, answer4, oh4Var, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        answer2 = answer;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            oh4Var3 = oh4Var;
        } else {
            oh4Var3 = oh4Var;
            if ((i & 3072) == 0) {
                if (bj4VarO.j(oh4Var3)) {
                    i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
        }
        i5 = i2 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                oh4Var4 = oh4Var2;
                if (bj4VarO.j(oh4Var4)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            i7 = i2 & 32;
            if (i7 != 0) {
                if ((196608 & i) == 0) {
                    ci4VarM489getLambda1$intercom_sdk_base_release = ci4Var;
                    if (bj4VarO.j(ci4VarM489getLambda1$intercom_sdk_base_release)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i3 & 74899) == 74898) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i5 != 0) {
                        bj4VarO.K(573866320);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new dc1(1);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF;
                    } else {
                        oh4Var5 = oh4Var4;
                    }
                    if (i7 != 0) {
                        ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                    }
                    bj4Var = bj4VarO;
                    v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                    oh4Var6 = oh4Var5;
                    ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                    answer4 = answer3;
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i10 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i5 != 0) {
                        bj4VarO.K(573866320);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new dc1(1);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF;
                    } else {
                        oh4Var5 = oh4Var4;
                    }
                    if (i7 != 0) {
                        ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                    }
                    bj4Var = bj4VarO;
                    v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                    oh4Var6 = oh4Var5;
                    ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                    answer4 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: g4b
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return UploadFileQuestionKt.UploadFileQuestion$lambda$2(ox6Var3, uploadFileQuestionModel, answer4, oh4Var, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ci4VarM489getLambda1$intercom_sdk_base_release = ci4Var;
            if ((i3 & 74899) == 74898) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i5 != 0) {
                    bj4VarO.K(573866320);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new dc1(1);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF;
                } else {
                    oh4Var5 = oh4Var4;
                }
                if (i7 != 0) {
                    ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                }
                bj4Var = bj4VarO;
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                oh4Var6 = oh4Var5;
                ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                answer4 = answer3;
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i5 != 0) {
                    bj4VarO.K(573866320);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new dc1(1);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF;
                } else {
                    oh4Var5 = oh4Var4;
                }
                if (i7 != 0) {
                    ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                }
                bj4Var = bj4VarO;
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                oh4Var6 = oh4Var5;
                ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                answer4 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: g4b
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return UploadFileQuestionKt.UploadFileQuestion$lambda$2(ox6Var3, uploadFileQuestionModel, answer4, oh4Var, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        oh4Var4 = oh4Var2;
        i7 = i2 & 32;
        if (i7 != 0) {
            if ((196608 & i) == 0) {
                ci4VarM489getLambda1$intercom_sdk_base_release = ci4Var;
                if (bj4VarO.j(ci4VarM489getLambda1$intercom_sdk_base_release)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((i3 & 74899) == 74898) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i5 != 0) {
                    bj4VarO.K(573866320);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new dc1(1);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF;
                } else {
                    oh4Var5 = oh4Var4;
                }
                if (i7 != 0) {
                    ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                }
                bj4Var = bj4VarO;
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                oh4Var6 = oh4Var5;
                ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                answer4 = answer3;
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i10 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i5 != 0) {
                    bj4VarO.K(573866320);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new dc1(1);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF;
                } else {
                    oh4Var5 = oh4Var4;
                }
                if (i7 != 0) {
                    ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
                }
                bj4Var = bj4VarO;
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
                oh4Var6 = oh4Var5;
                ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
                answer4 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: g4b
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return UploadFileQuestionKt.UploadFileQuestion$lambda$2(ox6Var3, uploadFileQuestionModel, answer4, oh4Var, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        ci4VarM489getLambda1$intercom_sdk_base_release = ci4Var;
        if ((i3 & 74899) == 74898) {
            if (i9 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i10 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i5 != 0) {
                bj4VarO.K(573866320);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new dc1(1);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                oh4Var5 = (oh4) objF;
            } else {
                oh4Var5 = oh4Var4;
            }
            if (i7 != 0) {
                ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
            }
            bj4Var = bj4VarO;
            v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
            oh4Var6 = oh4Var5;
            ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
            answer4 = answer3;
        } else {
            if (i9 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i10 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i5 != 0) {
                bj4VarO.K(573866320);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new dc1(1);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                oh4Var5 = (oh4) objF;
            } else {
                oh4Var5 = oh4Var4;
            }
            if (i7 != 0) {
                ci4VarM489getLambda1$intercom_sdk_base_release = ComposableSingletons$UploadFileQuestionKt.INSTANCE.m489getLambda1$intercom_sdk_base_release();
            }
            bj4Var = bj4VarO;
            v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1739158412, new AnonymousClass2(ox6Var3, ci4VarM489getLambda1$intercom_sdk_base_release, answer3, oh4Var5, uploadFileQuestionModel2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), oh4Var3), bj4VarO), bj4Var, 12582912, 127);
            oh4Var6 = oh4Var5;
            ci4Var2 = ci4VarM489getLambda1$intercom_sdk_base_release;
            answer4 = answer3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: g4b
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return UploadFileQuestionKt.UploadFileQuestion$lambda$2(ox6Var3, uploadFileQuestionModel, answer4, oh4Var, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadFileQuestion$lambda$1$lambda$0(AnswerClickData answerClickData) {
        answerClickData.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadFileQuestion$lambda$2(ox6 ox6Var, SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel, Answer answer, oh4 oh4Var, oh4 oh4Var2, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        UploadFileQuestion(ox6Var, uploadFileQuestionModel, answer, oh4Var, oh4Var2, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void UploadFileQuestionPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(21672603);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$UploadFileQuestionKt.INSTANCE.m490getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: h4b
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return UploadFileQuestionKt.UploadFileQuestionPreview$lambda$3(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadFileQuestionPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        UploadFileQuestionPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$UploadFileQuestion$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass2 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ Answer $answer;
        final /* synthetic */ Context $context;
        final /* synthetic */ ox6 $modifier;
        final /* synthetic */ oh4<Answer, g2b> $onAnswer;
        final /* synthetic */ oh4<AnswerClickData, g2b> $onAnswerClick;
        final /* synthetic */ ci4<jt1, Integer, g2b> $questionHeader;
        final /* synthetic */ SurveyData.Step.Question.UploadFileQuestionModel $questionModel;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ox6 ox6Var, ci4<? super jt1, ? super Integer, g2b> ci4Var, Answer answer, oh4<? super AnswerClickData, g2b> oh4Var, SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel, Context context, oh4<? super Answer, g2b> oh4Var2) {
            this.$modifier = ox6Var;
            this.$questionHeader = ci4Var;
            this.$answer = answer;
            this.$onAnswerClick = oh4Var;
            this.$questionModel = uploadFileQuestionModel;
            this.$context = context;
            this.$onAnswer = oh4Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$7$lambda$1$lambda$0(oh4 oh4Var, SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel, Answer.MediaAnswer.MediaItem mediaItem) {
            mediaItem.getClass();
            oh4Var.invoke(new AnswerClickData(mediaItem, uploadFileQuestionModel.getId()));
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$7$lambda$6$lambda$5(Answer answer, oh4 oh4Var, Context context, List list) {
            int i;
            list.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                MediaData.Media mediaData$default = URIExtensionsKt.getMediaData$default((Uri) it.next(), context, false, 2, null);
                if (mediaData$default != null) {
                    arrayList.add(mediaData$default);
                }
            }
            ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList2.add(new Answer.MediaAnswer.MediaItem((MediaData.Media) obj));
            }
            if (answer instanceof Answer.NoAnswer.InitialNoAnswer) {
                oh4Var.invoke(new Answer.MediaAnswer(arrayList2));
            } else {
                ArrayList arrayList3 = new ArrayList();
                answer.getClass();
                arrayList3.addAll(((Answer.MediaAnswer) answer).getMediaItems());
                arrayList3.addAll(arrayList2);
                oh4Var.invoke(new Answer.MediaAnswer(arrayList3));
            }
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ox6 ox6Var = this.$modifier;
            ci4<jt1, Integer, g2b> ci4Var = this.$questionHeader;
            final Answer answer = this.$answer;
            final oh4<AnswerClickData, g2b> oh4Var = this.$onAnswerClick;
            final SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel = this.$questionModel;
            final Context context = this.$context;
            final oh4<Answer, g2b> oh4Var2 = this.$onAnswer;
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC = it1.c(jt1Var, ox6Var);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC);
            ci4Var.invoke(jt1Var, 0);
            ox6.a aVar2 = ox6.a.t;
            b47.b(jt1Var, ir9.d(aVar2, 8.0f));
            jt1Var.K(903575015);
            boolean z = answer instanceof Answer.MediaAnswer;
            Object obj = jt1.a.a;
            if (z) {
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                List<Answer.MediaAnswer.MediaItem> mediaItems = mediaAnswer.getMediaItems();
                jt1Var.K(903581547);
                boolean zJ = jt1Var.J(oh4Var) | jt1Var.j(uploadFileQuestionModel);
                Object objF = jt1Var.f();
                if (zJ || objF == obj) {
                    objF = new oh4() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.m
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            return UploadFileQuestionKt.AnonymousClass2.invoke$lambda$7$lambda$1$lambda$0(oh4Var, uploadFileQuestionModel, (Answer.MediaAnswer.MediaItem) obj2);
                        }
                    };
                    jt1Var.C(objF);
                }
                jt1Var.B();
                FileAttachmentListKt.FileAttachmentList(mediaItems, (oh4) objF, jt1Var, 0);
                if (!mediaAnswer.getMediaItems().isEmpty()) {
                    b47.b(jt1Var, ir9.d(aVar2, 8.0f));
                }
            }
            jt1Var.B();
            int size = z ? ((Answer.MediaAnswer) answer).getMediaItems().size() : 0;
            jt1Var.K(903602228);
            if (size < uploadFileQuestionModel.getMaxSelection()) {
                int maxSelection = uploadFileQuestionModel.getMaxSelection() - size;
                MediaType mediaType = MediaType.All;
                Set<String> supportedFileType = uploadFileQuestionModel.getSupportedFileType();
                jt1Var.K(903611491);
                boolean zJ2 = jt1Var.j(context) | jt1Var.J(answer) | jt1Var.J(oh4Var2);
                Object objF2 = jt1Var.f();
                if (zJ2 || objF2 == obj) {
                    objF2 = new oh4() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.n
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            return UploadFileQuestionKt.AnonymousClass2.invoke$lambda$7$lambda$6$lambda$5(answer, oh4Var2, context, (List) obj2);
                        }
                    };
                    jt1Var.C(objF2);
                }
                jt1Var.B();
                MediaPickerButtonKt.MediaPickerButton(maxSelection, null, mediaType, supportedFileType, (oh4) objF2, new MediaPickerButtonCTAStyle.TextButton(nr1.f(jt1Var, R.string.intercom_add)), false, null, gr1.b(2026251827, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$UploadFileQuestion$2$1$3
                    public final void invoke(jt1 jt1Var2, int i2) {
                        if ((i2 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            AddFileButtonKt.AddFileButton(null, uploadFileQuestionModel.getMaxSelection() == 1 ? R.string.intercom_tickets_add_file : R.string.intercom_tickets_add_files, jt1Var2, 0, 1);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, jt1Var), jt1Var, 100663680, 194);
            }
            jt1Var.B();
            jt1Var.I();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
