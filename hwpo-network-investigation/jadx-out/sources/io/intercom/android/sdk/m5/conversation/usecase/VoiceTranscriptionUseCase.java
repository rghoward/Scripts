package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.f37;
import defpackage.g2b;
import defpackage.i37;
import defpackage.r02;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.errors.VoiceTranscriptionError;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class VoiceTranscriptionUseCase {
    public static final int $stable = 8;
    private final AudioRecordingUseCase audioRecordingUseCase;
    private final ConversationRepository conversationRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase$startRecording$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase", f = "VoiceTranscriptionUseCase.kt", l = {33, 38, 43}, m = "startRecording")
    public static final class AnonymousClass1 extends u02 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceTranscriptionUseCase.this.startRecording(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase$stopRecordingAndTranscribe$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase", f = "VoiceTranscriptionUseCase.kt", l = {57, 67, 73, 78, 82}, m = "stopRecordingAndTranscribe")
    public static final class C03591 extends u02 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C03591(r02<? super C03591> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceTranscriptionUseCase.this.stopRecordingAndTranscribe(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase$transcribeAudioFile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase", f = "VoiceTranscriptionUseCase.kt", l = {102, 107, 119, 124}, m = "transcribeAudioFile")
    public static final class C03601 extends u02 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C03601(r02<? super C03601> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceTranscriptionUseCase.this.transcribeAudioFile(null, null, null, null, this);
        }
    }

    public VoiceTranscriptionUseCase(AudioRecordingUseCase audioRecordingUseCase, ConversationRepository conversationRepository) {
        audioRecordingUseCase.getClass();
        conversationRepository.getClass();
        this.audioRecordingUseCase = audioRecordingUseCase;
        this.conversationRepository = conversationRepository;
    }

    private final boolean isFileSizeValid(File file) {
        return file.length() <= 10485760;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9 A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:47:0x010d, B:39:0x00a3, B:41:0x00a9, B:42:0x00b5, B:44:0x00f6, B:52:0x0150, B:54:0x0154, B:59:0x0167, B:55:0x015b, B:57:0x015f), top: B:73:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0150 A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:47:0x010d, B:39:0x00a3, B:41:0x00a9, B:42:0x00b5, B:44:0x00f6, B:52:0x0150, B:54:0x0154, B:59:0x0167, B:55:0x015b, B:57:0x015f), top: B:73:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0154 A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:47:0x010d, B:39:0x00a3, B:41:0x00a9, B:42:0x00b5, B:44:0x00f6, B:52:0x0150, B:54:0x0154, B:59:0x0167, B:55:0x015b, B:57:0x015f), top: B:73:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x015b A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:47:0x010d, B:39:0x00a3, B:41:0x00a9, B:42:0x00b5, B:44:0x00f6, B:52:0x0150, B:54:0x0154, B:59:0x0167, B:55:0x015b, B:57:0x015f), top: B:73:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x015f A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:47:0x010d, B:39:0x00a3, B:41:0x00a9, B:42:0x00b5, B:44:0x00f6, B:52:0x0150, B:54:0x0154, B:59:0x0167, B:55:0x015b, B:57:0x015f), top: B:73:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0166  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017a, code lost:
    
        if (r10.updateErrorState(r6, r3, r1, r2) == r9) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019f, code lost:
    
        if (r10.updateErrorState(r5, r3, r1, r2) == r9) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3, types: [f37] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v5, types: [i37] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object transcribeAudioFile(java.io.File r40, defpackage.i37<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r41, defpackage.f37<io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect> r42, defpackage.f37<io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect> r43, defpackage.r02<? super defpackage.g2b> r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase.transcribeAudioFile(java.io.File, i37, f37, f37, r02):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateErrorState(VoiceTranscriptionError voiceTranscriptionError, i37<ConversationClientState> i37Var, f37<ConversationUiEffect> f37Var, r02<? super g2b> r02Var) {
        ConversationClientState value;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, new VoiceTranscriptionState.Error(voiceTranscriptionError), null, 6291455, null)));
        Object objEmit = f37Var.emit(ConversationUiEffect.UnlockScreenOrientation.INSTANCE, r02Var);
        return objEmit == v72.t ? objEmit : g2b.a;
    }

    public final Object cancelRecording(i37<ConversationClientState> i37Var, f37<ConversationUiEffect> f37Var, r02<? super g2b> r02Var) {
        ConversationClientState value;
        this.audioRecordingUseCase.cancelRecording();
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, VoiceTranscriptionState.Idle.INSTANCE, null, 6291455, null)));
        Object objEmit = f37Var.emit(ConversationUiEffect.UnlockScreenOrientation.INSTANCE, r02Var);
        return objEmit == v72.t ? objEmit : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d5 A[Catch: Exception -> 0x00ec, TryCatch #1 {Exception -> 0x00ec, blocks: (B:38:0x00e9, B:31:0x008a, B:33:0x00c9, B:35:0x00d5), top: B:53:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        if (r1.updateErrorState(r6, r2, r4, r3) == r9) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [f37, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5, types: [i37] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [i37, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [f37, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [f37] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startRecording(defpackage.i37<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r38, defpackage.f37<io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect> r39, defpackage.r02<? super defpackage.g2b> r40) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase.startRecording(i37, f37, r02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017d, code lost:
    
        if (r2.emit(r0, r6) == r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a8, code lost:
    
        if (r1.updateErrorState(r2, r3, r4, r6) == r12) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [i37, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [i37, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [i37] */
    /* JADX WARN: Type inference failed for: r3v8, types: [i37] */
    /* JADX WARN: Type inference failed for: r4v0, types: [f37, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [f37, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [f37] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stopRecordingAndTranscribe(defpackage.i37<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r40, defpackage.f37<io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect> r41, defpackage.f37<io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect> r42, defpackage.r02<? super defpackage.g2b> r43) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase.stopRecordingAndTranscribe(i37, f37, f37, r02):java.lang.Object");
    }
}
