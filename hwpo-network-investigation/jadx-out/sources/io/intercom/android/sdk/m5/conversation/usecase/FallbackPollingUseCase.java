package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.kt3;
import defpackage.mh4;
import defpackage.qq2;
import defpackage.r02;
import defpackage.u02;
import defpackage.xm2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FallbackPollingUseCase {
    public static final int $stable = 8;
    private final mh4<AppConfig> appConfig;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase", f = "FallbackPollingUseCase.kt", l = {32, 38}, m = "invoke")
    public static final class AnonymousClass1 extends u02 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FallbackPollingUseCase.this.invoke(null, this);
        }
    }

    public /* synthetic */ FallbackPollingUseCase(mh4 mh4Var, TimeProvider timeProvider, RefreshConversationUseCase refreshConversationUseCase, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? new kt3(0) : mh4Var, (i & 2) != 0 ? Injector.get().getTimeProvider() : timeProvider, refreshConversationUseCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getDataLayer().getConfig().getValue();
    }

    public final mh4<AppConfig> getAppConfig() {
        return this.appConfig;
    }

    public final RefreshConversationUseCase getRefreshConversationUseCase() {
        return this.refreshConversationUseCase;
    }

    public final TimeProvider getTimeProvider() {
        return this.timeProvider;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b A[PHI: r13 r14
      0x004b: PHI (r13v4 'this' io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase) = 
      (r13v0 'this' io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase A[IMMUTABLE_TYPE, THIS])
      (r13v1 'this' io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase)
      (r13v12 'this' io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase)
     binds: [B:16:0x0048, B:34:0x00ce, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r14v4 i37<io.intercom.android.sdk.m5.conversation.states.ConversationClientState>) = 
      (r14v0 i37<io.intercom.android.sdk.m5.conversation.states.ConversationClientState>)
      (r14v1 i37<io.intercom.android.sdk.m5.conversation.states.ConversationClientState>)
      (r14v10 i37<io.intercom.android.sdk.m5.conversation.states.ConversationClientState>)
     binds: [B:16:0x0048, B:34:0x00ce, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ce -> B:17:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invoke(defpackage.i37<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r14, defpackage.r02<? super defpackage.g2b> r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase.invoke(i37, r02):java.lang.Object");
    }

    public FallbackPollingUseCase(mh4<AppConfig> mh4Var, TimeProvider timeProvider, RefreshConversationUseCase refreshConversationUseCase) {
        mh4Var.getClass();
        timeProvider.getClass();
        refreshConversationUseCase.getClass();
        this.appConfig = mh4Var;
        this.timeProvider = timeProvider;
        this.refreshConversationUseCase = refreshConversationUseCase;
    }
}
