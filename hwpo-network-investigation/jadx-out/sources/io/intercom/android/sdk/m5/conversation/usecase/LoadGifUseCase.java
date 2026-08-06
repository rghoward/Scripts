package io.intercom.android.sdk.m5.conversation.usecase;

import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.i37;
import defpackage.r02;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.GifResponse;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadGifUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase", f = "LoadGifUseCase.kt", l = {17}, m = "invoke")
    public static final class AnonymousClass1 extends u02 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoadGifUseCase.this.invoke(null, null, this);
        }
    }

    public LoadGifUseCase(ConversationRepository conversationRepository) {
        conversationRepository.getClass();
        this.conversationRepository = conversationRepository;
    }

    public static /* synthetic */ Object invoke$default(LoadGifUseCase loadGifUseCase, i37 i37Var, String str, r02 r02Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str = BuildConfig.FLAVOR;
        }
        return loadGifUseCase.invoke(i37Var, str, r02Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object invoke(i37<ConversationClientState> i37Var, String str, r02<? super g2b> r02Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        i37<ConversationClientState> i37Var2;
        BottomSheetState.GifSearch gifSearch;
        ConversationClientState value;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(r02Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            dv8.b(obj);
            ConversationRepository conversationRepository = this.conversationRepository;
            anonymousClass1.L$0 = i37Var;
            anonymousClass1.label = 1;
            Object objLoadGifs = conversationRepository.loadGifs(str, anonymousClass1);
            v72 v72Var = v72.t;
            if (objLoadGifs == v72Var) {
                return v72Var;
            }
            obj = objLoadGifs;
            i37Var2 = i37Var;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i37Var2 = (i37) anonymousClass1.L$0;
            dv8.b(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            gifSearch = new BottomSheetState.GifSearch(hf3.t);
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                u.b();
                return null;
            }
            List<Block> listResults = ((GifResponse) ((NetworkResponse.Success) networkResponse).getBody()).results();
            listResults.getClass();
            gifSearch = new BottomSheetState.GifSearch(listResults);
        }
        BottomSheetState.GifSearch gifSearch2 = gifSearch;
        do {
            value = i37Var2.getValue();
        } while (!i37Var2.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, gifSearch2, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388575, null)));
        return g2b.a;
    }
}
