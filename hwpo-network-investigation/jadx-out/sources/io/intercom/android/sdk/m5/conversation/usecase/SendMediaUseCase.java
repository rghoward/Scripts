package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.f37;
import defpackage.i37;
import defpackage.qq2;
import defpackage.r02;
import defpackage.u02;
import defpackage.xm2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.MediaUploadRepository;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SendMediaUseCase {
    public static final int $stable = 8;
    private final MediaUploadRepository mediaUploadRepository;
    private final SendMessageUseCase sendMessageUseCase;
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase", f = "SendMediaUseCase.kt", l = {91, 97, 113}, m = "invoke")
    public static final class AnonymousClass1 extends u02 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendMediaUseCase.this.invoke(null, null, null, null, this);
        }
    }

    public SendMediaUseCase(SendMessageUseCase sendMessageUseCase, MediaUploadRepository mediaUploadRepository, UserIdentity userIdentity) {
        sendMessageUseCase.getClass();
        mediaUploadRepository.getClass();
        userIdentity.getClass();
        this.sendMessageUseCase = sendMessageUseCase;
        this.mediaUploadRepository = mediaUploadRepository;
        this.userIdentity = userIdentity;
    }

    public static /* synthetic */ Object invoke$default(SendMediaUseCase sendMediaUseCase, i37 i37Var, f37 f37Var, MediaData.Media media, String str, r02 r02Var, int i, Object obj) {
        if ((i & 8) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMediaUseCase.invoke(i37Var, f37Var, media, str, r02Var);
    }

    public final SendMessageUseCase getSendMessageUseCase() {
        return this.sendMessageUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a0, code lost:
    
        if (r0.invoke(r1, r2, r8, r5) == r12) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0249, code lost:
    
        if (r13.emit(r0, r5) == r12) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(defpackage.i37<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r41, defpackage.f37<io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect> r42, io.intercom.android.sdk.m5.upload.data.MediaData.Media r43, java.lang.String r44, defpackage.r02<? super defpackage.g2b> r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase.invoke(i37, f37, io.intercom.android.sdk.m5.upload.data.MediaData$Media, java.lang.String, r02):java.lang.Object");
    }

    public /* synthetic */ SendMediaUseCase(SendMessageUseCase sendMessageUseCase, MediaUploadRepository mediaUploadRepository, UserIdentity userIdentity, int i, qq2 qq2Var) {
        this(sendMessageUseCase, mediaUploadRepository, (i & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity);
    }
}
