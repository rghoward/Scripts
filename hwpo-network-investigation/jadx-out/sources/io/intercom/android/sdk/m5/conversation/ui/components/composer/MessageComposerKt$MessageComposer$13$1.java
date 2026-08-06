package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.aa0;
import defpackage.ay;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.fl;
import defpackage.g2b;
import defpackage.h37;
import defpackage.kha;
import defpackage.p6a;
import defpackage.r02;
import defpackage.s54;
import defpackage.t72;
import defpackage.v72;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.zl9;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$13$1", f = "MessageComposer.kt", l = {160}, m = "invokeSuspend")
public final class MessageComposerKt$MessageComposer$13$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ zl9<ComposerUiEffect> $composerUiEffect;
    final /* synthetic */ String $reportAiMessage;
    final /* synthetic */ h37<kha> $textFieldValue$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageComposerKt$MessageComposer$13$1(zl9<? extends ComposerUiEffect> zl9Var, String str, h37<kha> h37Var, r02<? super MessageComposerKt$MessageComposer$13$1> r02Var) {
        super(2, r02Var);
        this.$composerUiEffect = zl9Var;
        this.$reportAiMessage = str;
        this.$textFieldValue$delegate = h37Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new MessageComposerKt$MessageComposer$13$1(this.$composerUiEffect, this.$reportAiMessage, this.$textFieldValue$delegate, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((MessageComposerKt$MessageComposer$13$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            zl9<ComposerUiEffect> zl9Var = this.$composerUiEffect;
            if (zl9Var == null) {
                return g2b.a;
            }
            final String str = this.$reportAiMessage;
            final h37<kha> h37Var = this.$textFieldValue$delegate;
            s54<? super ComposerUiEffect> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$13$1.1
                public final Object emit(ComposerUiEffect composerUiEffect, r02<? super g2b> r02Var) {
                    kha khaVar;
                    h37<kha> h37Var2 = h37Var;
                    if (xj5.a(composerUiEffect, ComposerUiEffect.ReportAiAnswer.INSTANCE)) {
                        String str2 = str;
                        int length = str2.length();
                        khaVar = new kha(4, ay.c(length, length), str2);
                    } else {
                        if (!(composerUiEffect instanceof ComposerUiEffect.UpdateTranscribedText)) {
                            defpackage.u.b();
                            return null;
                        }
                        ComposerUiEffect.UpdateTranscribedText updateTranscribedText = (ComposerUiEffect.UpdateTranscribedText) composerUiEffect;
                        String text = updateTranscribedText.getText();
                        int length2 = updateTranscribedText.getText().length();
                        khaVar = new kha(4, ay.c(length2, length2), text);
                    }
                    h37Var2.setValue(khaVar);
                    return g2b.a;
                }

                @Override // defpackage.s54
                public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                    return emit((ComposerUiEffect) obj2, (r02<? super g2b>) r02Var);
                }
            };
            this.label = 1;
            Object objCollect = zl9Var.collect(s54Var, this);
            v72 v72Var = v72.t;
            if (objCollect == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        fl.a();
        return null;
    }
}
