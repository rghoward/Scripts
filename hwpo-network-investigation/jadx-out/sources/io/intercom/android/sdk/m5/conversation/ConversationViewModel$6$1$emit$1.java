package io.intercom.android.sdk.m5.conversation;

import defpackage.r02;
import defpackage.u02;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1", f = "ConversationViewModel.kt", l = {347}, m = "emit")
public final class ConversationViewModel$6$1$emit$1 extends u02 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationViewModel.AnonymousClass6.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationViewModel$6$1$emit$1(ConversationViewModel.AnonymousClass6.AnonymousClass1<? super T> anonymousClass1, r02<? super ConversationViewModel$6$1$emit$1> r02Var) {
        super(r02Var);
        this.this$0 = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type r02 to io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1$emit$1 for r1v2 'this'  r02
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r1 = r2.emit(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
