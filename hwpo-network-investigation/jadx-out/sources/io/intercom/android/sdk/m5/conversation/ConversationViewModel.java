package io.intercom.android.sdk.m5.conversation;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.a0a;
import defpackage.a74;
import defpackage.aa0;
import defpackage.am9;
import defpackage.b0a;
import defpackage.ba1;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.ei4;
import defpackage.el5;
import defpackage.et2;
import defpackage.f37;
import defpackage.ff3;
import defpackage.fl;
import defpackage.g2b;
import defpackage.gy2;
import defpackage.hf3;
import defpackage.i23;
import defpackage.i37;
import defpackage.j74;
import defpackage.lb2;
import defpackage.ll8;
import defpackage.m74;
import defpackage.mhb;
import defpackage.n72;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import defpackage.rhb;
import defpackage.s54;
import defpackage.sd1;
import defpackage.t72;
import defpackage.th1;
import defpackage.thb;
import defpackage.ty1;
import defpackage.u;
import defpackage.u02;
import defpackage.u72;
import defpackage.uhb;
import defpackage.um9;
import defpackage.uz9;
import defpackage.v72;
import defpackage.vhb;
import defpackage.whb;
import defpackage.wn5;
import defpackage.wr2;
import defpackage.wt4;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.xx0;
import defpackage.yk2;
import defpackage.z2a;
import defpackage.z64;
import defpackage.z90;
import defpackage.zl9;
import defpackage.zz9;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.data.MediaUploadRepository;
import io.intercom.android.sdk.m5.conversation.data.MediaUploadStateRepository;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.reducers.ConversationReducer;
import io.intercom.android.sdk.m5.conversation.reducers.InitialStateReducerKt;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.FinStreamingData;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.PushNotificationsBannerState;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.usecase.Action;
import io.intercom.android.sdk.m5.conversation.usecase.AppendPartToConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.AudioRecordingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ChangeInputUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState;
import io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.MarkUserContentAsSeenByAdmin;
import io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.PushNotificationsBannerUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RecordOpenedInteractionUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendGifUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.TrackLastReceivedPartsUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.UpdateFloatingIndicatorUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioRecordingManager;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationViewModel extends mhb {
    private static final long DEBOUNCE_DELAY_MS = 500;
    private final f37<ComposerUiEffect> _composerUiEffect;
    private final f37<ConversationUiEffect> _uiEffect;
    private el5 adminIsTypingJob;
    private final ShowAdminIsTypingUseCase adminIsTypingUseCase;
    private final AppendPartToConversationUseCase appendPartToConversationUseCase;
    private final ArticleMetadata articleMetadata;
    private final t72 audioAmplitudeCoroutineScope;
    private final AudioRecordingManager audioRecordingManager;
    private final AudioRecordingUseCase audioRecordingUseCase;
    private final ChangeInputUseCase changeInputUseCase;
    private final i37<ConversationClientState> clientState;
    private final zl9<ComposerUiEffect> composerUiEffect;
    private final ConversationReducer conversationReducer;
    private final ConversationRepository conversationRepository;
    private final String decodedInitialMessage;
    private final n72 dispatcher;
    private final FallbackPollingUseCase fallbackPollingUseCase;
    private final FinStreamingUseCase finStreamingUseCase;
    private final i37<SearchQuery> gifQueryStateFlow;
    private final String initialConversationId;
    private final IntercomDataLayer intercomDataLayer;
    private final LaunchMode launchMode;
    private final LoadGifUseCase loadGifUseCase;
    private final MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin;
    private final MediaUploadRepository mediaUploadRepository;
    private final MediaUploadStateRepository mediaUploadStateRepository;
    private final MetricTracker metricTracker;
    private final NetworkConnectivityMonitor networkConnectivityMonitor;
    private final t72 nexusCoroutineScope;
    private final OpenConversationUseCase openConversationUseCase;
    private final PushNotificationsBannerUseCase pushNotificationsBannerUseCase;
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;
    private final i37<Boolean> resumedState;
    private final SendGifUseCase sendGifUseCase;
    private final SendMediaUseCase sendMediaUseCase;
    private final SendMessageUseCase sendMessageUseCase;
    private final SendQuickReplyUseCase sendQuickReplyUseCase;
    private final SendSuggestionUseCase sendSuggestionUseCase;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final SoundPlayer soundPlayer;
    private final SubmitAttributeUseCase submitAttributeUseCase;
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;
    private final Twig twig;
    private final zl9<ConversationUiEffect> uiEffect;
    private final zz9<ConversationUiState> uiState;
    private final UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase;
    private final VoiceTranscriptionUseCase voiceTranscriptionUseCase;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1", f = "ConversationViewModel.kt", l = {242}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            AnonymousClass1 anonymousClass1 = ConversationViewModel.this.new AnonymousClass1(r02Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                final t72 t72Var = (t72) this.L$0;
                final r54<ParsedNexusEvent> r54VarRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                final r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(r02 r02Var) {
                                super(r02Var);
                            }

                            @Override // defpackage.ak0
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(s54 s54Var) {
                            this.$this_unsafeFlow = s54Var;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // defpackage.s54
                        public final Object emit(Object obj, r02 r02Var) throws Throwable {
                            AnonymousClass1 anonymousClass1;
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
                            Object obj2 = anonymousClass1.result;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                dv8.b(obj2);
                                s54 s54Var = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
                                    anonymousClass1.label = 1;
                                    Object objEmit = s54Var.emit(obj, anonymousClass1);
                                    v72 v72Var = v72.t;
                                    if (objEmit == v72Var) {
                                        return v72Var;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj2);
                            }
                            return g2b.a;
                        }
                    }

                    @Override // defpackage.r54
                    public Object collect(s54<? super Object> s54Var, r02 r02Var) {
                        Object objCollect = r54VarRealTimeEvents.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                r54<ParsedNexusEvent.ConversationNexusEvent> r54Var2 = new r54<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2", f = "ConversationViewModel.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(r02 r02Var) {
                                super(r02Var);
                            }

                            @Override // defpackage.ak0
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(s54 s54Var, ConversationViewModel conversationViewModel) {
                            this.$this_unsafeFlow = s54Var;
                            this.this$0 = conversationViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
                        /* JADX WARN: Code duplicated, block: B:24:0x0073 A[RETURN] */
                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // defpackage.s54
                        public final Object emit(Object obj, r02 r02Var) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            Object objEmit;
                            v72 v72Var;
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
                            Object obj2 = anonymousClass1.result;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                dv8.b(obj2);
                                s54 s54Var = this.$this_unsafeFlow;
                                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) obj;
                                if (xj5.a(conversationNexusEvent.getConversationId(), ((ConversationClientState) this.this$0.clientState.getValue()).getConversationId())) {
                                    anonymousClass1.label = 1;
                                    objEmit = s54Var.emit(obj, anonymousClass1);
                                    v72Var = v72.t;
                                    if (objEmit == v72Var) {
                                        return v72Var;
                                    }
                                } else {
                                    ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping adminIsTyping = conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping ? (ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) conversationNexusEvent : null;
                                    if (adminIsTyping != null && ConversationViewModelKt.isFastFinTyping(adminIsTyping, (ConversationClientState) this.this$0.clientState.getValue())) {
                                        anonymousClass1.label = 1;
                                        objEmit = s54Var.emit(obj, anonymousClass1);
                                        v72Var = v72.t;
                                        if (objEmit == v72Var) {
                                            return v72Var;
                                        }
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj2);
                            }
                            return g2b.a;
                        }
                    }

                    @Override // defpackage.r54
                    public Object collect(s54<? super ParsedNexusEvent.ConversationNexusEvent> s54Var, r02 r02Var) {
                        Object objCollect = r54Var.collect(new AnonymousClass2(s54Var, conversationViewModel), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                final ConversationViewModel conversationViewModel2 = ConversationViewModel.this;
                s54<? super ParsedNexusEvent.ConversationNexusEvent> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.1.2

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$1", f = "ConversationViewModel.kt", l = {255}, m = "invokeSuspend")
                    public static final class C01451 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                        final /* synthetic */ ParsedNexusEvent.ConversationNexusEvent $it;
                        int label;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01451(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, ConversationViewModel conversationViewModel, r02<? super C01451> r02Var) {
                            super(2, r02Var);
                            this.$it = conversationNexusEvent;
                            this.this$0 = conversationViewModel;
                        }

                        @Override // defpackage.ak0
                        public final r02<g2b> create(Object obj, r02<?> r02Var) {
                            return new C01451(this.$it, this.this$0, r02Var);
                        }

                        @Override // defpackage.ci4
                        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                            return ((C01451) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                        }

                        @Override // defpackage.ak0
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            int i = this.label;
                            if (i == 0) {
                                dv8.b(obj);
                                Part.Builder partBuilder = ((ParsedNexusEvent.ConversationNexusEvent.NewComment) this.$it).getPartBuilder();
                                ConversationViewModel conversationViewModel = this.this$0;
                                if (partBuilder != null) {
                                    conversationViewModel.appendPartToConversationUseCase.invoke(this.this$0.clientState, ((ParsedNexusEvent.ConversationNexusEvent.NewComment) this.$it).getPartBuilder());
                                } else {
                                    RefreshConversationUseCase refreshConversationUseCase = conversationViewModel.refreshConversationUseCase;
                                    i37<ConversationClientState> i37Var = this.this$0.clientState;
                                    GetConversationReason getConversationReason = GetConversationReason.NEW_COMMENT;
                                    this.label = 1;
                                    Object objInvoke = refreshConversationUseCase.invoke(i37Var, getConversationReason, this);
                                    v72 v72Var = v72.t;
                                    if (objInvoke == v72Var) {
                                        return v72Var;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj);
                            }
                            this.this$0.soundEffectsUseCase.invoke$intercom_sdk_base_release(z2a.w(((ParsedNexusEvent.ConversationNexusEvent.NewComment) this.$it).getCreatedByUser()) ? Action.OPERATOR_MESSAGE_RECEIVED : Action.ADMIN_MESSAGE_RECEIVED);
                            return g2b.a;
                        }
                    }

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$2, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$2", f = "ConversationViewModel.kt", l = {271}, m = "invokeSuspend")
                    public static final class C01462 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                        final /* synthetic */ ParsedNexusEvent.ConversationNexusEvent $it;
                        int label;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01462(ConversationViewModel conversationViewModel, ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, r02<? super C01462> r02Var) {
                            super(2, r02Var);
                            this.this$0 = conversationViewModel;
                            this.$it = conversationNexusEvent;
                        }

                        @Override // defpackage.ak0
                        public final r02<g2b> create(Object obj, r02<?> r02Var) {
                            return new C01462(this.this$0, this.$it, r02Var);
                        }

                        @Override // defpackage.ci4
                        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                            return ((C01462) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                        }

                        @Override // defpackage.ak0
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            int i = this.label;
                            if (i == 0) {
                                dv8.b(obj);
                                ShowAdminIsTypingUseCase showAdminIsTypingUseCase = this.this$0.adminIsTypingUseCase;
                                i37<ConversationClientState> i37Var = this.this$0.clientState;
                                Avatar avatar = ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).getAvatar();
                                boolean zIsBot = ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).isBot();
                                boolean showAvatar = ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).getShowAvatar();
                                this.label = 1;
                                Object objInvoke = showAdminIsTypingUseCase.invoke(i37Var, avatar, zIsBot, showAvatar, this);
                                v72 v72Var = v72.t;
                                if (objInvoke == v72Var) {
                                    return v72Var;
                                }
                            } else {
                                if (i != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj);
                            }
                            return g2b.a;
                        }
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, r02<? super g2b> r02Var) {
                        if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment) {
                            oy0.d(t72Var, null, null, new C01451(conversationNexusEvent, conversationViewModel2, null), 3);
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) {
                            el5 el5Var = conversationViewModel2.adminIsTypingJob;
                            if (el5Var != null) {
                                el5Var.k(null);
                            }
                            ConversationViewModel conversationViewModel3 = conversationViewModel2;
                            conversationViewModel3.adminIsTypingJob = oy0.d(t72Var, null, null, new C01462(conversationViewModel3, conversationNexusEvent, null), 3);
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.UserContentSeenByAdmin) {
                            conversationViewModel2.markUserContentAsSeenByAdmin.invoke(conversationViewModel2.clientState);
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.FinStreaming) {
                            Object objInvoke = conversationViewModel2.finStreamingUseCase.invoke(conversationViewModel2.clientState, (ParsedNexusEvent.ConversationNexusEvent.FinStreaming) conversationNexusEvent, r02Var);
                            return objInvoke == v72.t ? objInvoke : g2b.a;
                        }
                        return g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                Object objCollect = r54Var2.collect(s54Var, this);
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
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$2", f = "ConversationViewModel.kt", l = {CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new AnonymousClass2(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                FallbackPollingUseCase fallbackPollingUseCase = ConversationViewModel.this.fallbackPollingUseCase;
                i37<ConversationClientState> i37Var = ConversationViewModel.this.clientState;
                this.label = 1;
                Object objInvoke = fallbackPollingUseCase.invoke(i37Var, this);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$4", f = "ConversationViewModel.kt", l = {321}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass4(r02<? super AnonymousClass4> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new AnonymousClass4(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass4) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                final r54<ParsedNexusEvent> r54VarRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(r02 r02Var) {
                                super(r02Var);
                            }

                            @Override // defpackage.ak0
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(s54 s54Var) {
                            this.$this_unsafeFlow = s54Var;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // defpackage.s54
                        public final Object emit(Object obj, r02 r02Var) throws Throwable {
                            AnonymousClass1 anonymousClass1;
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
                            Object obj2 = anonymousClass1.result;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                dv8.b(obj2);
                                s54 s54Var = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.NexusConnected) {
                                    anonymousClass1.label = 1;
                                    Object objEmit = s54Var.emit(obj, anonymousClass1);
                                    v72 v72Var = v72.t;
                                    if (objEmit == v72Var) {
                                        return v72Var;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj2);
                            }
                            return g2b.a;
                        }
                    }

                    @Override // defpackage.r54
                    public Object collect(s54<? super Object> s54Var, r02 r02Var) {
                        Object objCollect = r54VarRealTimeEvents.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                s54<? super Object> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.4.1
                    public final Object emit(ParsedNexusEvent.NexusConnected nexusConnected, r02<? super g2b> r02Var) {
                        conversationViewModel.twig.d("Nexus connected", new Object[0]);
                        Object objInvoke = conversationViewModel.refreshConversationUseCase.invoke(conversationViewModel.clientState, GetConversationReason.NEXUS_CONNECTED, r02Var);
                        return objInvoke == v72.t ? objInvoke : g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((ParsedNexusEvent.NexusConnected) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                Object objCollect = r54Var.collect(s54Var, this);
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
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5", f = "ConversationViewModel.kt", l = {334}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass5(r02<? super AnonymousClass5> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new AnonymousClass5(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass5) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                final r54<ParsedNexusEvent> r54VarRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(r02 r02Var) {
                                super(r02Var);
                            }

                            @Override // defpackage.ak0
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(s54 s54Var) {
                            this.$this_unsafeFlow = s54Var;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // defpackage.s54
                        public final Object emit(Object obj, r02 r02Var) throws Throwable {
                            AnonymousClass1 anonymousClass1;
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
                            Object obj2 = anonymousClass1.result;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                dv8.b(obj2);
                                s54 s54Var = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.AblyReconnectedWithoutResume) {
                                    anonymousClass1.label = 1;
                                    Object objEmit = s54Var.emit(obj, anonymousClass1);
                                    v72 v72Var = v72.t;
                                    if (objEmit == v72Var) {
                                        return v72Var;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj2);
                            }
                            return g2b.a;
                        }
                    }

                    @Override // defpackage.r54
                    public Object collect(s54<? super Object> s54Var, r02 r02Var) {
                        Object objCollect = r54VarRealTimeEvents.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                s54<? super Object> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.5.1
                    public final Object emit(ParsedNexusEvent.AblyReconnectedWithoutResume ablyReconnectedWithoutResume, r02<? super g2b> r02Var) {
                        conversationViewModel.twig.d("Ably reconnected without resume - fetching conversation", new Object[0]);
                        Object objInvoke = conversationViewModel.refreshConversationUseCase.invoke(conversationViewModel.clientState, GetConversationReason.NEXUS_CONNECTED, r02Var);
                        return objInvoke == v72.t ? objInvoke : g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((ParsedNexusEvent.AblyReconnectedWithoutResume) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                Object objCollect = r54Var.collect(s54Var, this);
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
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7", f = "ConversationViewModel.kt", l = {365}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$2", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends p6a implements ci4<String, r02<? super String>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(r02Var);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // defpackage.ci4
            public final Object invoke(String str, r02<? super String> r02Var) {
                return ((AnonymousClass2) create(str, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label == 0) {
                    dv8.b(obj);
                    return z2a.R((String) this.L$0).toString();
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass7(r02<? super AnonymousClass7> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new AnonymousClass7(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                final i37 i37Var = ConversationViewModel.this.gifQueryStateFlow;
                final r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(r02 r02Var) {
                                super(r02Var);
                            }

                            @Override // defpackage.ak0
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(s54 s54Var) {
                            this.$this_unsafeFlow = s54Var;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // defpackage.s54
                        public final Object emit(Object obj, r02 r02Var) throws Throwable {
                            AnonymousClass1 anonymousClass1;
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
                            Object obj2 = anonymousClass1.result;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                dv8.b(obj2);
                                s54 s54Var = this.$this_unsafeFlow;
                                if (obj instanceof SearchQuery.Query) {
                                    anonymousClass1.label = 1;
                                    Object objEmit = s54Var.emit(obj, anonymousClass1);
                                    v72 v72Var = v72.t;
                                    if (objEmit == v72Var) {
                                        return v72Var;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj2);
                            }
                            return g2b.a;
                        }
                    }

                    @Override // defpackage.r54
                    public Object collect(s54<? super Object> s54Var, r02 r02Var) {
                        Object objCollect = i37Var.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                r54 r54VarH = yk2.h(new r54<String>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2", f = "ConversationViewModel.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(r02 r02Var) {
                                super(r02Var);
                            }

                            @Override // defpackage.ak0
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(s54 s54Var) {
                            this.$this_unsafeFlow = s54Var;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // defpackage.s54
                        public final Object emit(Object obj, r02 r02Var) throws Throwable {
                            AnonymousClass1 anonymousClass1;
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
                            Object obj2 = anonymousClass1.result;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                dv8.b(obj2);
                                s54 s54Var = this.$this_unsafeFlow;
                                String value = ((SearchQuery.Query) obj).getValue();
                                anonymousClass1.label = 1;
                                Object objEmit = s54Var.emit(value, anonymousClass1);
                                v72 v72Var = v72.t;
                                if (objEmit == v72Var) {
                                    return v72Var;
                                }
                            } else {
                                if (i2 != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj2);
                            }
                            return g2b.a;
                        }
                    }

                    @Override // defpackage.r54
                    public Object collect(s54<? super String> s54Var, r02 r02Var) {
                        Object objCollect = r54Var.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                }, ConversationViewModel.DEBOUNCE_DELAY_MS);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                int i2 = a74.a;
                r54 r54VarI = yk2.i(new ba1(new z64(anonymousClass2, null), r54VarH, ff3.t, -2, xx0.t));
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                s54 s54Var = new s54() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.7.3
                    public final Object emit(String str, r02<? super g2b> r02Var) throws Throwable {
                        Object objInvoke = conversationViewModel.loadGifUseCase.invoke(conversationViewModel.clientState, str, r02Var);
                        return objInvoke == v72.t ? objInvoke : g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((String) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                Object objCollect = r54VarI.collect(s54Var, this);
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
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$8", f = "ConversationViewModel.kt", l = {370}, m = "invokeSuspend")
    public static final class AnonymousClass8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass8(r02<? super AnonymousClass8> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new AnonymousClass8(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                zz9<List<MediaUploadItem>> uploadStates = ConversationViewModel.this.mediaUploadStateRepository.getUploadStates();
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                s54<? super List<MediaUploadItem>> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.8.1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(List<MediaUploadItem> list, r02<? super g2b> r02Var) {
                        Object value;
                        i37 i37Var = conversationViewModel.clientState;
                        do {
                            value = i37Var.getValue();
                        } while (!i37Var.c(value, ConversationClientState.copy$default((ConversationClientState) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, list, 4194303, null)));
                        return g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((List<MediaUploadItem>) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                Object objCollect = uploadStates.collect(s54Var, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$cancelVoiceRecording$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$cancelVoiceRecording$1", f = "ConversationViewModel.kt", l = {733}, m = "invokeSuspend")
    public static final class C03371 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03371(r02<? super C03371> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03371(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03371) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                VoiceTranscriptionUseCase voiceTranscriptionUseCase = ConversationViewModel.this.voiceTranscriptionUseCase;
                i37<ConversationClientState> i37Var = ConversationViewModel.this.clientState;
                f37<ConversationUiEffect> f37Var = ConversationViewModel.this._uiEffect;
                this.label = 1;
                Object objCancelRecording = voiceTranscriptionUseCase.cancelRecording(i37Var, f37Var, this);
                v72 v72Var = v72.t;
                if (objCancelRecording == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadConversation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadConversation$1", f = "ConversationViewModel.kt", l = {671}, m = "invokeSuspend")
    public static final class C03381 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03381(r02<? super C03381> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03381(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03381) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                OpenConversationUseCase openConversationUseCase = ConversationViewModel.this.openConversationUseCase;
                i37 i37Var = ConversationViewModel.this.clientState;
                this.label = 1;
                Object objInvoke$default = OpenConversationUseCase.invoke$default(openConversationUseCase, i37Var, null, this, 2, null);
                v72 v72Var = v72.t;
                if (objInvoke$default == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadGifs$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$loadGifs$2", f = "ConversationViewModel.kt", l = {533}, m = "invokeSuspend")
    public static final class C03392 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03392(r02<? super C03392> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03392(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03392) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                LoadGifUseCase loadGifUseCase = ConversationViewModel.this.loadGifUseCase;
                i37 i37Var = ConversationViewModel.this.clientState;
                this.label = 1;
                Object objInvoke$default = LoadGifUseCase.invoke$default(loadGifUseCase, i37Var, null, this, 2, null);
                v72 v72Var = v72.t;
                if (objInvoke$default == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onFailedMediaUploadItem$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onFailedMediaUploadItem$1", f = "ConversationViewModel.kt", l = {620}, m = "invokeSuspend")
    public static final class C03401 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ MediaUploadItem $uploadItem;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03401(MediaUploadItem mediaUploadItem, r02<? super C03401> r02Var) {
            super(2, r02Var);
            this.$uploadItem = mediaUploadItem;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03401(this.$uploadItem, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03401) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                f37 f37Var = ConversationViewModel.this._uiEffect;
                ConversationUiEffect.ShowUploadErrorDialog showUploadErrorDialog = new ConversationUiEffect.ShowUploadErrorDialog(this.$uploadItem);
                this.label = 1;
                Object objEmit = f37Var.emit(showUploadErrorDialog, this);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onInputChange$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onInputChange$1", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C03411 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ ComposerInputType $inputType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03411(ComposerInputType composerInputType, r02<? super C03411> r02Var) {
            super(2, r02Var);
            this.$inputType = composerInputType;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03411(this.$inputType, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03411) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            ConversationViewModel.this.changeInputUseCase.invoke(ConversationViewModel.this.clientState, this.$inputType);
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReplyOptionClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReplyOptionClicked$1", f = "ConversationViewModel.kt", l = {454}, m = "invokeSuspend")
    public static final class C03421 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ ReplyOption $replyOption;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03421(ReplyOption replyOption, r02<? super C03421> r02Var) {
            super(2, r02Var);
            this.$replyOption = replyOption;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03421(this.$replyOption, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03421) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                Conversation conversation = ((ConversationClientState) ConversationViewModel.this.clientState.getValue()).getConversation();
                if (conversation != null) {
                    ConversationViewModel conversationViewModel = ConversationViewModel.this;
                    ReplyOption replyOption = this.$replyOption;
                    SendQuickReplyUseCase sendQuickReplyUseCase = conversationViewModel.sendQuickReplyUseCase;
                    i37<ConversationClientState> i37Var = conversationViewModel.clientState;
                    Part part = (Part) th1.G(conversation.parts());
                    this.label = 1;
                    Object objInvoke = sendQuickReplyUseCase.invoke(i37Var, replyOption, part, this);
                    v72 v72Var = v72.t;
                    if (objInvoke == v72Var) {
                        return v72Var;
                    }
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReportAiAnswer$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReportAiAnswer$1", f = "ConversationViewModel.kt", l = {694}, m = "invokeSuspend")
    public static final class C03431 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03431(r02<? super C03431> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03431(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03431) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                f37 f37Var = ConversationViewModel.this._composerUiEffect;
                ComposerUiEffect.ReportAiAnswer reportAiAnswer = ComposerUiEffect.ReportAiAnswer.INSTANCE;
                this.label = 1;
                Object objEmit = f37Var.emit(reportAiAnswer, this);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryClick$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryClick$2", f = "ConversationViewModel.kt", l = {546}, m = "invokeSuspend")
    public static final class C03442 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03442(r02<? super C03442> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03442(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03442) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                OpenConversationUseCase openConversationUseCase = ConversationViewModel.this.openConversationUseCase;
                i37 i37Var = ConversationViewModel.this.clientState;
                this.label = 1;
                Object objInvoke$default = OpenConversationUseCase.invoke$default(openConversationUseCase, i37Var, null, this, 2, null);
                v72 v72Var = v72.t;
                if (objInvoke$default == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMediaClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMediaClicked$1", f = "ConversationViewModel.kt", l = {644}, m = "invokeSuspend")
    public static final class C03451 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ PendingMessage.FailedMediaUploadData $failedMediaUploadData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03451(PendingMessage.FailedMediaUploadData failedMediaUploadData, r02<? super C03451> r02Var) {
            super(2, r02Var);
            this.$failedMediaUploadData = failedMediaUploadData;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03451(this.$failedMediaUploadData, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03451) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                SendMediaUseCase sendMediaUseCase = ConversationViewModel.this.sendMediaUseCase;
                i37<ConversationClientState> i37Var = ConversationViewModel.this.clientState;
                f37<ConversationUiEffect> f37Var = ConversationViewModel.this._uiEffect;
                MediaData.Media mediaData = this.$failedMediaUploadData.getMediaData();
                String clientAssignedUUID = this.$failedMediaUploadData.getClientAssignedUUID();
                this.label = 1;
                Object objInvoke = sendMediaUseCase.invoke(i37Var, f37Var, mediaData, clientAssignedUUID, this);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMessageClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMessageClicked$1", f = "ConversationViewModel.kt", l = {634}, m = "invokeSuspend")
    public static final class C03461 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ Part $part;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03461(Part part, r02<? super C03461> r02Var) {
            super(2, r02Var);
            this.$part = part;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03461(this.$part, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03461) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                SendMessageUseCase sendMessageUseCase = ConversationViewModel.this.sendMessageUseCase;
                i37<ConversationClientState> i37Var = ConversationViewModel.this.clientState;
                List<Block> blocks = this.$part.getBlocks();
                blocks.getClass();
                ArrayList arrayList = new ArrayList(ph1.n(blocks, 10));
                Iterator<T> it = blocks.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Block) it.next()).toBuilder());
                }
                String uuid = this.$part.getUuid();
                uuid.getClass();
                this.label = 1;
                Object objInvoke = sendMessageUseCase.invoke(i37Var, arrayList, uuid, this);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSubmitAttribute$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSubmitAttribute$1", f = "ConversationViewModel.kt", l = {554}, m = "invokeSuspend")
    public static final class C03471 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ Attribute $attribute;
        final /* synthetic */ String $partId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03471(Attribute attribute, String str, r02<? super C03471> r02Var) {
            super(2, r02Var);
            this.$attribute = attribute;
            this.$partId = str;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03471(this.$attribute, this.$partId, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03471) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                SubmitAttributeUseCase submitAttributeUseCase = ConversationViewModel.this.submitAttributeUseCase;
                i37<ConversationClientState> i37Var = ConversationViewModel.this.clientState;
                Attribute attribute = this.$attribute;
                String str = this.$partId;
                this.label = 1;
                Object objInvoke = submitAttributeUseCase.invoke(i37Var, attribute, str, this);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSuggestionClick$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onSuggestionClick$1", f = "ConversationViewModel.kt", l = {444}, m = "invokeSuspend")
    public static final class C03481 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ ReplySuggestion $suggestion;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03481(ReplySuggestion replySuggestion, r02<? super C03481> r02Var) {
            super(2, r02Var);
            this.$suggestion = replySuggestion;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03481(this.$suggestion, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03481) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                SendSuggestionUseCase sendSuggestionUseCase = ConversationViewModel.this.sendSuggestionUseCase;
                i37<ConversationClientState> i37Var = ConversationViewModel.this.clientState;
                ReplySuggestion replySuggestion = this.$suggestion;
                this.label = 1;
                Object objInvoke = sendSuggestionUseCase.invoke(i37Var, replySuggestion, this);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendGif$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendGif$1", f = "ConversationViewModel.kt", l = {521}, m = "invokeSuspend")
    public static final class C03491 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ MediaData.Gif $mediaData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03491(MediaData.Gif gif, r02<? super C03491> r02Var) {
            super(2, r02Var);
            this.$mediaData = gif;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03491(this.$mediaData, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03491) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                SendGifUseCase sendGifUseCase = ConversationViewModel.this.sendGifUseCase;
                i37<ConversationClientState> i37Var = ConversationViewModel.this.clientState;
                MediaData.Gif gif = this.$mediaData;
                this.label = 1;
                Object objInvoke = sendGifUseCase.invoke(i37Var, gif, this);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMedia$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMedia$1", f = "ConversationViewModel.kt", l = {560}, m = "invokeSuspend")
    public static final class C03501 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ MediaData.Media $mediaData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03501(MediaData.Media media, r02<? super C03501> r02Var) {
            super(2, r02Var);
            this.$mediaData = media;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03501(this.$mediaData, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03501) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                SendMediaUseCase sendMediaUseCase = ConversationViewModel.this.sendMediaUseCase;
                i37 i37Var = ConversationViewModel.this.clientState;
                f37 f37Var = ConversationViewModel.this._uiEffect;
                MediaData.Media media = this.$mediaData;
                this.label = 1;
                Object objInvoke$default = SendMediaUseCase.invoke$default(sendMediaUseCase, i37Var, f37Var, media, null, this, 8, null);
                v72 v72Var = v72.t;
                if (objInvoke$default == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$sendMessage$1", f = "ConversationViewModel.kt", l = {428}, m = "invokeSuspend")
    public static final class C03511 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ List<MediaUploadItem> $mediaUploadItems;
        final /* synthetic */ String $messageText;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03511(String str, List<MediaUploadItem> list, r02<? super C03511> r02Var) {
            super(2, r02Var);
            this.$messageText = str;
            this.$mediaUploadItems = list;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03511(this.$messageText, this.$mediaUploadItems, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03511) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            C03511 c03511;
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                SendMessageUseCase sendMessageUseCase = ConversationViewModel.this.sendMessageUseCase;
                i37 i37Var = ConversationViewModel.this.clientState;
                String str = this.$messageText;
                List<MediaUploadItem> list = this.$mediaUploadItems;
                this.label = 1;
                c03511 = this;
                Object objInvoke$default = SendMessageUseCase.invoke$default(sendMessageUseCase, i37Var, str, list, null, c03511, 8, null);
                v72 v72Var = v72.t;
                if (objInvoke$default == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                c03511 = this;
            }
            ConversationViewModel.this.clearMediaUploadItems();
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$showMediaItemsLimitDialog$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$showMediaItemsLimitDialog$1", f = "ConversationViewModel.kt", l = {570}, m = "invokeSuspend")
    public static final class C03521 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03521(r02<? super C03521> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03521(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03521) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                f37 f37Var = ConversationViewModel.this._uiEffect;
                ConversationUiEffect.ShowMediaLimitExceeded showMediaLimitExceeded = new ConversationUiEffect.ShowMediaLimitExceeded(10);
                this.label = 1;
                Object objEmit = f37Var.emit(showMediaLimitExceeded, this);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$startVoiceRecording$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$startVoiceRecording$1", f = "ConversationViewModel.kt", l = {717}, m = "invokeSuspend")
    public static final class C03531 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03531(r02<? super C03531> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03531(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03531) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                VoiceTranscriptionUseCase voiceTranscriptionUseCase = ConversationViewModel.this.voiceTranscriptionUseCase;
                i37<ConversationClientState> i37Var = ConversationViewModel.this.clientState;
                f37<ConversationUiEffect> f37Var = ConversationViewModel.this._uiEffect;
                this.label = 1;
                Object objStartRecording = voiceTranscriptionUseCase.startRecording(i37Var, f37Var, this);
                v72 v72Var = v72.t;
                if (objStartRecording == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$stopVoiceRecordingAndTranscribe$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$stopVoiceRecordingAndTranscribe$1", f = "ConversationViewModel.kt", l = {723}, m = "invokeSuspend")
    public static final class C03541 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03541(r02<? super C03541> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03541(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03541) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                VoiceTranscriptionUseCase voiceTranscriptionUseCase = ConversationViewModel.this.voiceTranscriptionUseCase;
                i37<ConversationClientState> i37Var = ConversationViewModel.this.clientState;
                f37<ConversationUiEffect> f37Var = ConversationViewModel.this._uiEffect;
                f37<ComposerUiEffect> f37Var2 = ConversationViewModel.this._composerUiEffect;
                this.label = 1;
                Object objStopRecordingAndTranscribe = voiceTranscriptionUseCase.stopRecordingAndTranscribe(i37Var, f37Var, f37Var2, this);
                v72 v72Var = v72.t;
                if (objStopRecordingAndTranscribe == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$updateTranscribedText$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$updateTranscribedText$1", f = "ConversationViewModel.kt", l = {700}, m = "invokeSuspend")
    public static final class C03551 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ String $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03551(String str, r02<? super C03551> r02Var) {
            super(2, r02Var);
            this.$text = str;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new C03551(this.$text, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03551) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                f37 f37Var = ConversationViewModel.this._composerUiEffect;
                ComposerUiEffect.UpdateTranscribedText updateTranscribedText = new ComposerUiEffect.UpdateTranscribedText(this.$text);
                this.label = 1;
                Object objEmit = f37Var.emit(updateTranscribedText, this);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationViewModel(String str, LaunchMode launchMode, ArticleMetadata articleMetadata, String str2, NetworkConnectivityMonitor networkConnectivityMonitor, SoundPlayer soundPlayer, t72 t72Var, t72 t72Var2, ConversationRepository conversationRepository, ConversationReducer conversationReducer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, SoundEffectsUseCase soundEffectsUseCase, SendSuggestionUseCase sendSuggestionUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, RefreshConversationUseCase refreshConversationUseCase, AppendPartToConversationUseCase appendPartToConversationUseCase, OpenConversationUseCase openConversationUseCase, SendMessageUseCase sendMessageUseCase, SendQuickReplyUseCase sendQuickReplyUseCase, LoadGifUseCase loadGifUseCase, ChangeInputUseCase changeInputUseCase, SendGifUseCase sendGifUseCase, MediaUploadRepository mediaUploadRepository, MediaUploadStateRepository mediaUploadStateRepository, SendMediaUseCase sendMediaUseCase, UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase, GetNetworkState getNetworkState, ShowAdminIsTypingUseCase showAdminIsTypingUseCase, SubmitAttributeUseCase submitAttributeUseCase, FallbackPollingUseCase fallbackPollingUseCase, PushNotificationsBannerUseCase pushNotificationsBannerUseCase, AudioRecordingManager audioRecordingManager, AudioRecordingUseCase audioRecordingUseCase, VoiceTranscriptionUseCase voiceTranscriptionUseCase, MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin, FinStreamingUseCase finStreamingUseCase, n72 n72Var, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer, Twig twig, int i, int i2, qq2 qq2Var) {
        t72 t72VarA;
        t72 t72VarA2;
        RecordOpenedInteractionUseCase recordOpenedInteractionUseCase2;
        RefreshConversationUseCase refreshConversationUseCase2;
        MediaUploadRepository mediaUploadRepository2;
        SendMessageUseCase sendMessageUseCase2;
        SendMediaUseCase sendMediaUseCase2;
        AudioRecordingManager audioRecordingManager2;
        n72 n72Var2;
        MetricTracker metricTracker2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        String str3 = (i & 1) != 0 ? null : str;
        ArticleMetadata articleMetadata2 = (i & 4) != 0 ? null : articleMetadata;
        NetworkConnectivityMonitor networkConnectivityMonitor2 = (i & 16) != 0 ? new NetworkConnectivityMonitor() : networkConnectivityMonitor;
        SoundPlayer soundPlayer2 = (i & 32) != 0 ? new SoundPlayer() : soundPlayer;
        if ((i & 64) != 0) {
            et2 et2Var = i23.a;
            t72VarA = u72.a(wr2.v);
        } else {
            t72VarA = t72Var;
        }
        if ((i & 128) != 0) {
            et2 et2Var2 = i23.a;
            t72VarA2 = u72.a(wr2.v);
        } else {
            t72VarA2 = t72Var2;
        }
        t72 t72Var3 = t72VarA;
        ConversationRepository conversationRepository2 = (i & 256) != 0 ? new ConversationRepository(null, null, null, null, null, null, t72Var3, 63, null) : conversationRepository;
        ConversationReducer conversationReducer2 = (i & 512) != 0 ? new ConversationReducer(null, null, null, 7, null) : conversationReducer;
        int i3 = 3;
        TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase2 = (i & 1024) != 0 ? new TrackLastReceivedPartsUseCase(metricTracker2, objArr7 == true ? 1 : 0, i3, objArr6 == true ? 1 : 0) : trackLastReceivedPartsUseCase;
        RecordOpenedInteractionUseCase recordOpenedInteractionUseCase3 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? new RecordOpenedInteractionUseCase(conversationRepository2) : recordOpenedInteractionUseCase;
        SoundEffectsUseCase soundEffectsUseCase2 = (i & 4096) != 0 ? new SoundEffectsUseCase(objArr5 == true ? 1 : 0, soundPlayer2, 1, objArr4 == true ? 1 : 0) : soundEffectsUseCase;
        SendSuggestionUseCase sendSuggestionUseCase2 = (i & 8192) != 0 ? new SendSuggestionUseCase(conversationRepository2, soundEffectsUseCase2, null, 4, null) : sendSuggestionUseCase;
        RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase2 = (i & 16384) != 0 ? new RefreshUnreadConversationsCountUseCase(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i3, objArr == true ? 1 : 0) : refreshUnreadConversationsCountUseCase;
        if ((32768 & i) != 0) {
            RecordOpenedInteractionUseCase recordOpenedInteractionUseCase4 = recordOpenedInteractionUseCase3;
            recordOpenedInteractionUseCase2 = recordOpenedInteractionUseCase4;
            refreshConversationUseCase2 = new RefreshConversationUseCase(conversationRepository2, null, trackLastReceivedPartsUseCase2, recordOpenedInteractionUseCase4, 2, null);
        } else {
            recordOpenedInteractionUseCase2 = recordOpenedInteractionUseCase3;
            refreshConversationUseCase2 = refreshConversationUseCase;
        }
        AppendPartToConversationUseCase appendPartToConversationUseCase2 = (65536 & i) != 0 ? new AppendPartToConversationUseCase(trackLastReceivedPartsUseCase2, recordOpenedInteractionUseCase2) : appendPartToConversationUseCase;
        OpenConversationUseCase openConversationUseCase2 = (131072 & i) != 0 ? new OpenConversationUseCase(refreshConversationUseCase2, refreshUnreadConversationsCountUseCase2, null, 4, null) : openConversationUseCase;
        SendMessageUseCase sendMessageUseCase3 = (262144 & i) != 0 ? new SendMessageUseCase(conversationRepository2, refreshConversationUseCase2, soundEffectsUseCase2, null, null, 24, null) : sendMessageUseCase;
        SendQuickReplyUseCase sendQuickReplyUseCase2 = (524288 & i) != 0 ? new SendQuickReplyUseCase(conversationRepository2, refreshConversationUseCase2, soundEffectsUseCase2, null, 8, null) : sendQuickReplyUseCase;
        LoadGifUseCase loadGifUseCase2 = (1048576 & i) != 0 ? new LoadGifUseCase(conversationRepository2) : loadGifUseCase;
        ChangeInputUseCase changeInputUseCase2 = (2097152 & i) != 0 ? new ChangeInputUseCase() : changeInputUseCase;
        SendGifUseCase sendGifUseCase2 = (i & 4194304) != 0 ? new SendGifUseCase(sendMessageUseCase3, changeInputUseCase2) : sendGifUseCase;
        MediaUploadRepository mediaUploadRepository3 = (8388608 & i) != 0 ? new MediaUploadRepository(conversationRepository2, null, null, 6, null) : mediaUploadRepository;
        MediaUploadStateRepository mediaUploadStateRepository2 = (i & 16777216) != 0 ? new MediaUploadStateRepository(mediaUploadRepository3) : mediaUploadStateRepository;
        if ((33554432 & i) != 0) {
            MediaUploadRepository mediaUploadRepository4 = mediaUploadRepository3;
            SendMessageUseCase sendMessageUseCase4 = sendMessageUseCase3;
            sendMessageUseCase2 = sendMessageUseCase4;
            mediaUploadRepository2 = mediaUploadRepository4;
            sendMediaUseCase2 = new SendMediaUseCase(sendMessageUseCase4, mediaUploadRepository4, null, 4, null);
        } else {
            mediaUploadRepository2 = mediaUploadRepository3;
            sendMessageUseCase2 = sendMessageUseCase3;
            sendMediaUseCase2 = sendMediaUseCase;
        }
        UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase2 = (67108864 & i) != 0 ? new UpdateFloatingIndicatorUseCase() : updateFloatingIndicatorUseCase;
        GetNetworkState getNetworkState2 = (134217728 & i) != 0 ? new GetNetworkState(networkConnectivityMonitor2) : getNetworkState;
        ShowAdminIsTypingUseCase showAdminIsTypingUseCase2 = (268435456 & i) != 0 ? new ShowAdminIsTypingUseCase() : showAdminIsTypingUseCase;
        SubmitAttributeUseCase submitAttributeUseCase2 = (536870912 & i) != 0 ? new SubmitAttributeUseCase(conversationRepository2) : submitAttributeUseCase;
        FallbackPollingUseCase fallbackPollingUseCase2 = (1073741824 & i) != 0 ? new FallbackPollingUseCase(null, null, refreshConversationUseCase2, 3, null) : fallbackPollingUseCase;
        PushNotificationsBannerUseCase pushNotificationsBannerUseCase2 = (i & Integer.MIN_VALUE) != 0 ? new PushNotificationsBannerUseCase(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : pushNotificationsBannerUseCase;
        if ((i2 & 1) != 0) {
            Application application = Injector.get().getApplication();
            application.getClass();
            audioRecordingManager2 = new AudioRecordingManager(application, t72VarA2);
        } else {
            audioRecordingManager2 = audioRecordingManager;
        }
        AudioRecordingUseCase audioRecordingUseCase2 = (i2 & 2) != 0 ? new AudioRecordingUseCase(audioRecordingManager2, null, 2, 0 == true ? 1 : 0) : audioRecordingUseCase;
        VoiceTranscriptionUseCase voiceTranscriptionUseCase2 = (i2 & 4) != 0 ? new VoiceTranscriptionUseCase(audioRecordingUseCase2, conversationRepository2) : voiceTranscriptionUseCase;
        MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin2 = (i2 & 8) != 0 ? new MarkUserContentAsSeenByAdmin() : markUserContentAsSeenByAdmin;
        FinStreamingUseCase finStreamingUseCase2 = (i2 & 16) != 0 ? new FinStreamingUseCase() : finStreamingUseCase;
        if ((i2 & 32) != 0) {
            et2 et2Var3 = i23.a;
            n72Var2 = wr2.v;
        } else {
            n72Var2 = n72Var;
        }
        this(str3, launchMode, articleMetadata2, str2, networkConnectivityMonitor2, soundPlayer2, t72Var3, t72VarA2, conversationRepository2, conversationReducer2, trackLastReceivedPartsUseCase2, recordOpenedInteractionUseCase2, soundEffectsUseCase2, sendSuggestionUseCase2, refreshUnreadConversationsCountUseCase2, refreshConversationUseCase2, appendPartToConversationUseCase2, openConversationUseCase2, sendMessageUseCase2, sendQuickReplyUseCase2, loadGifUseCase2, changeInputUseCase2, sendGifUseCase2, mediaUploadRepository2, mediaUploadStateRepository2, sendMediaUseCase2, updateFloatingIndicatorUseCase2, getNetworkState2, showAdminIsTypingUseCase2, submitAttributeUseCase2, fallbackPollingUseCase2, pushNotificationsBannerUseCase2, audioRecordingManager2, audioRecordingUseCase2, voiceTranscriptionUseCase2, markUserContentAsSeenByAdmin2, finStreamingUseCase2, n72Var2, (i2 & 64) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i2 & 128) != 0 ? Injector.get().getDataLayer() : intercomDataLayer, (i2 & 256) != 0 ? LumberMill.getLogger() : twig);
    }

    private final String getConversationContext() {
        return this.clientState.getValue().getConversationId() == null ? "new_conversation" : MetricTracker.Context.EXISTING_CONVERSATION;
    }

    private final void loadConversation() {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03381(null), 2);
    }

    private final void sendGif(MediaData.Gif gif) {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03491(gif, null), 2);
    }

    private final void sendMedia(MediaData.Media media) {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03501(media, null), 2);
    }

    public static /* synthetic */ void uploadMediaItems$default(ConversationViewModel conversationViewModel, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        conversationViewModel.uploadMediaItems(list, i);
    }

    public final void cancelVoiceRecording() {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03371(null), 2);
    }

    public final void clearMediaUploadItems() {
        this.mediaUploadStateRepository.cancelAllUploads();
    }

    public final void deleteMediaUploadItem(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        this.mediaUploadStateRepository.removeMediaItem(mediaUploadItem.getInstanceId());
    }

    public final zz9<Float> getAmplitudeLevel() {
        return this.audioRecordingManager.getAmplitudeLevel();
    }

    public final zl9<ComposerUiEffect> getComposerUiEffect() {
        return this.composerUiEffect;
    }

    public final String getConversationId() {
        return this.clientState.getValue().getConversationId();
    }

    public final zl9<ConversationUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final zz9<ConversationUiState> getUiState() {
        return this.uiState;
    }

    public final void loadGifs() {
        ConversationClientState value;
        i37<ConversationClientState> i37Var = this.clientState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, new BottomSheetState.GifSearch(hf3.t), null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388575, null)));
        oy0.d(rhb.b(this), this.dispatcher, null, new C03392(null), 2);
    }

    @Override // defpackage.mhb
    public void onCleared() {
        super.onCleared();
        u72.c(this.nexusCoroutineScope, null);
        u72.c(this.audioAmplitudeCoroutineScope, null);
        this.audioRecordingManager.dispose();
        this.mediaUploadStateRepository.cancelAllUploads();
    }

    public final void onConversationScrolled(ConversationScrolledState conversationScrolledState) {
        ConversationClientState value;
        conversationScrolledState.getClass();
        i37<ConversationClientState> i37Var = this.clientState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, conversationScrolledState.getScrolled(), false, null, null, null, 8126463, null)));
        this.updateFloatingIndicatorUseCase.invoke(this.clientState, conversationScrolledState);
    }

    public final void onFailedMediaUploadItem(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03401(mediaUploadItem, null), 2);
    }

    public final void onGifSearchQueryChange(String str) {
        str.getClass();
        this.gifQueryStateFlow.setValue(new SearchQuery.Query(str));
    }

    public final void onInputChange(ComposerInputType composerInputType) {
        composerInputType.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03411(composerInputType, null), 2);
    }

    public final void onJumpToBottomButtonClicked(int i) {
        ConversationClientState value;
        FloatingIndicatorState floatingIndicatorState = this.clientState.getValue().getFloatingIndicatorState();
        if (floatingIndicatorState instanceof FloatingIndicatorState.JumpToBottomIndicator) {
            i37<ConversationClientState> i37Var = this.clientState;
            do {
                value = i37Var.getValue();
            } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, ((FloatingIndicatorState.JumpToBottomIndicator) floatingIndicatorState).copy(new JumpToBottomButtonState(0, i)), null, false, false, null, null, null, 8323071, null)));
        }
    }

    public final void onNetworkMessageDismissed() {
        ConversationClientState value;
        if (xj5.a(this.clientState.getValue().getNetworkState(), NetworkState.Reconnected.INSTANCE)) {
            i37<ConversationClientState> i37Var = this.clientState;
            do {
                value = i37Var.getValue();
            } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, NetworkState.Connected.INSTANCE, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388095, null)));
        }
    }

    public final void onPause(Context context) {
        context.getClass();
        this.networkConnectivityMonitor.stopListening(context);
        this.soundPlayer.release();
        this.resumedState.setValue(Boolean.FALSE);
        cancelVoiceRecording();
    }

    public final void onPrivacyNoticeDismissed() {
        ConversationClientState value;
        i37<ConversationClientState> i37Var = this.clientState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, true, null, null, null, 7864319, null)));
        this.conversationRepository.dismissPrivacyPolicy();
    }

    public final void onReplyOptionClicked(ReplyOption replyOption) {
        replyOption.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03421(replyOption, null), 2);
    }

    public final void onReportAiAnswer() {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03431(null), 2);
    }

    public final void onResume(Context context) {
        context.getClass();
        this.networkConnectivityMonitor.startListening(context);
        this.soundPlayer.loadSounds(context);
        this.resumedState.setValue(Boolean.TRUE);
    }

    public final void onRetryClick() {
        ConversationClientState value;
        i37<ConversationClientState> i37Var = this.clientState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388479, null)));
        oy0.d(rhb.b(this), this.dispatcher, null, new C03442(null), 2);
    }

    public final void onRetryMediaClicked(PendingMessage.FailedMediaUploadData failedMediaUploadData) {
        failedMediaUploadData.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03451(failedMediaUploadData, null), 2);
    }

    public final void onRetryMessageClicked(Part part) {
        part.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03461(part, null), 2);
    }

    public final void onSubmitAttribute(Attribute attribute, String str) {
        attribute.getClass();
        str.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03471(attribute, str, null), 2);
    }

    public final void onSuggestionClick(ReplySuggestion replySuggestion) {
        replySuggestion.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03481(replySuggestion, null), 2);
    }

    public final void onTyping() {
        String conversationId = this.clientState.getValue().getConversationId();
        if (conversationId != null) {
            this.conversationRepository.nexusEventsRepository().userTyping(conversationId);
        }
    }

    public final void retryMediaItemUpload(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        this.mediaUploadStateRepository.retryUpload(mediaUploadItem.getInstanceId(), rhb.b(this));
    }

    public final void sendMediaData(MediaData mediaData) {
        mediaData.getClass();
        if (mediaData instanceof MediaData.Media) {
            sendMedia((MediaData.Media) mediaData);
        } else if (mediaData instanceof MediaData.Gif) {
            sendGif((MediaData.Gif) mediaData);
        } else {
            u.b();
        }
    }

    public final void sendMessage(String str, List<MediaUploadItem> list, boolean z) {
        str.getClass();
        list.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03511(str, list, null), 2);
        this.pushNotificationsBannerUseCase.invoke(this.clientState, z);
    }

    public final void showMediaItemsLimitDialog() {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03521(null), 2);
    }

    public final void startVoiceRecording() {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03531(null), 2);
    }

    public final void stopVoiceRecordingAndTranscribe() {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03541(null), 2);
    }

    @gy2
    public final void trackClickedInput(String str) {
        str.getClass();
        MetricTracker metricTracker = this.metricTracker;
        String conversationId = this.clientState.getValue().getConversationId();
        if (conversationId == null) {
            conversationId = BuildConfig.FLAVOR;
        }
        metricTracker.clickedInput(conversationId, str);
    }

    public final void trackMetric(MetricData metricData) {
        metricData.getClass();
        if (metricData instanceof MetricData.MoreMenuClicked) {
            this.metricTracker.moreMenuClicked(getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.ConversationsInMoreMenuClicked) {
            this.metricTracker.conversationsInMoreMenuClicked(((MetricData.ConversationsInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.NewConversationInMoreMenuClicked) {
            this.metricTracker.newConversationInMoreMenuClicked(((MetricData.NewConversationInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.TicketsInMoreMenuClicked) {
            this.metricTracker.ticketsInMoreMenuClicked(((MetricData.TicketsInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (metricData.equals(MetricData.HelpInMoreMenuClicked.INSTANCE)) {
            this.metricTracker.helpInMoreMenuClicked(getConversationContext());
            return;
        }
        if (metricData.equals(MetricData.PoweredByClicked.INSTANCE)) {
            this.metricTracker.clickedPoweredBy("conversation");
            return;
        }
        if (!(metricData instanceof MetricData.ComposerInputClicked)) {
            u.b();
            return;
        }
        MetricTracker metricTracker = this.metricTracker;
        String conversationId = this.clientState.getValue().getConversationId();
        if (conversationId == null) {
            conversationId = BuildConfig.FLAVOR;
        }
        metricTracker.clickedInput(conversationId, ((MetricData.ComposerInputClicked) metricData).getInput());
    }

    public final void updateBottomSheet(BottomSheetState bottomSheetState) {
        ConversationClientState value;
        bottomSheetState.getClass();
        i37<ConversationClientState> i37Var = this.clientState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, bottomSheetState, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388575, null)));
    }

    public final void updatePushNotificationsBanner(boolean z, boolean z2) {
        this.intercomDataLayer.updatePushNotificationsBannerDismissed(z);
        this.pushNotificationsBannerUseCase.invoke(this.clientState, z2);
    }

    public final void updateTranscribedText(String str) {
        str.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03551(str, null), 2);
    }

    public final void uploadMediaItems(List<? extends MediaData.Media> list, int i) {
        list.getClass();
        if (this.mediaUploadStateRepository.addAndStartUploading(list, rhb.b(this), i).getHasLimitRejections()) {
            showMediaItemsLimitDialog();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public static /* synthetic */ ConversationViewModel create$default(Companion companion, whb whbVar, String str, String str2, ArticleMetadata articleMetadata, LaunchMode launchMode, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = BuildConfig.FLAVOR;
            }
            String str3 = str2;
            if ((i & 8) != 0) {
                articleMetadata = null;
            }
            return companion.create(whbVar, str, str3, articleMetadata, launchMode);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.intercom.android.sdk.m5.conversation.ConversationViewModel$Companion$factory$1] */
        private final ConversationViewModel$Companion$factory$1 factory(final String str, final String str2, final ArticleMetadata articleMetadata, final LaunchMode launchMode) {
            return new thb.c() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$Companion$factory$1
                @Override // thb.c
                public <T extends mhb> T create(Class<T> cls) {
                    cls.getClass();
                    return new ConversationViewModel(str, launchMode, articleMetadata, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16, 511, null);
                }

                @Override // thb.c
                public /* bridge */ /* synthetic */ mhb create(Class cls, lb2 lb2Var) {
                    return super.create(cls, lb2Var);
                }

                @Override // thb.c
                public /* bridge */ /* synthetic */ mhb create(wn5 wn5Var, lb2 lb2Var) {
                    return super.create(wn5Var, lb2Var);
                }
            };
        }

        public final ConversationViewModel create(whb whbVar, String str, String str2, ArticleMetadata articleMetadata, LaunchMode launchMode) {
            whbVar.getClass();
            str2.getClass();
            launchMode.getClass();
            ConversationViewModel$Companion$factory$1 conversationViewModel$Companion$factory$1Factory = factory(str, str2, articleMetadata, launchMode);
            conversationViewModel$Companion$factory$1Factory.getClass();
            vhb viewModelStore = whbVar.getViewModelStore();
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            uhb uhbVar = new uhb(viewModelStore, conversationViewModel$Companion$factory$1Factory, defaultViewModelCreationExtras);
            sd1 sd1VarA = ll8.a(ConversationViewModel.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (ConversationViewModel) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3", f = "ConversationViewModel.kt", l = {312}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$3", f = "ConversationViewModel.kt", l = {313}, m = "invokeSuspend")
        public static final class C01473 extends p6a implements ci4<ParsedNexusEvent.ConversationNexusEvent, r02<? super g2b>, Object> {
            int label;
            final /* synthetic */ ConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01473(ConversationViewModel conversationViewModel, r02<? super C01473> r02Var) {
                super(2, r02Var);
                this.this$0 = conversationViewModel;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C01473(this.this$0, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, r02<? super g2b> r02Var) {
                return ((C01473) create(conversationNexusEvent, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i == 0) {
                    dv8.b(obj);
                    RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase = this.this$0.refreshUnreadConversationsCountUseCase;
                    i37<ConversationClientState> i37Var = this.this$0.clientState;
                    this.label = 1;
                    Object objInvoke = refreshUnreadConversationsCountUseCase.invoke(i37Var, this);
                    v72 v72Var = v72.t;
                    if (objInvoke == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                return g2b.a;
            }
        }

        public AnonymousClass3(r02<? super AnonymousClass3> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ConversationViewModel.this.new AnonymousClass3(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                final r54<ParsedNexusEvent> r54VarRealTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                final r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(r02 r02Var) {
                                super(r02Var);
                            }

                            @Override // defpackage.ak0
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(s54 s54Var) {
                            this.$this_unsafeFlow = s54Var;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // defpackage.s54
                        public final Object emit(Object obj, r02 r02Var) throws Throwable {
                            AnonymousClass1 anonymousClass1;
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
                            Object obj2 = anonymousClass1.result;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                dv8.b(obj2);
                                s54 s54Var = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
                                    anonymousClass1.label = 1;
                                    Object objEmit = s54Var.emit(obj, anonymousClass1);
                                    v72 v72Var = v72.t;
                                    if (objEmit == v72Var) {
                                        return v72Var;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj2);
                            }
                            return g2b.a;
                        }
                    }

                    @Override // defpackage.r54
                    public Object collect(s54<? super Object> s54Var, r02 r02Var) {
                        Object objCollect = r54VarRealTimeEvents.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                j74 j74Var = new j74(new m74(new r54<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2", f = "ConversationViewModel.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(r02 r02Var) {
                                super(r02Var);
                            }

                            @Override // defpackage.ak0
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(s54 s54Var, ConversationViewModel conversationViewModel) {
                            this.$this_unsafeFlow = s54Var;
                            this.this$0 = conversationViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // defpackage.s54
                        public final Object emit(Object obj, r02 r02Var) throws Throwable {
                            AnonymousClass1 anonymousClass1;
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
                            Object obj2 = anonymousClass1.result;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                dv8.b(obj2);
                                s54 s54Var = this.$this_unsafeFlow;
                                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) obj;
                                if (!xj5.a(conversationNexusEvent.getConversationId(), ((ConversationClientState) this.this$0.clientState.getValue()).getConversationId()) && (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment)) {
                                    anonymousClass1.label = 1;
                                    Object objEmit = s54Var.emit(obj, anonymousClass1);
                                    v72 v72Var = v72.t;
                                    if (objEmit == v72Var) {
                                        return v72Var;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj2);
                            }
                            return g2b.a;
                        }
                    }

                    @Override // defpackage.r54
                    public Object collect(s54<? super ParsedNexusEvent.ConversationNexusEvent> s54Var, r02 r02Var) {
                        Object objCollect = r54Var.collect(new AnonymousClass2(s54Var, conversationViewModel), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                }, ConversationViewModel.this.resumedState, new AnonymousClass2(null)));
                C01473 c01473 = new C01473(ConversationViewModel.this, null);
                this.label = 1;
                Object objF = yk2.f(j74Var, c01473, this);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$2", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends p6a implements ei4<ParsedNexusEvent.ConversationNexusEvent, Boolean, r02<? super ParsedNexusEvent.ConversationNexusEvent>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
                super(3, r02Var);
            }

            public final Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, boolean z, r02<? super ParsedNexusEvent.ConversationNexusEvent> r02Var) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(r02Var);
                anonymousClass2.L$0 = conversationNexusEvent;
                anonymousClass2.Z$0 = z;
                return anonymousClass2.invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) this.L$0;
                if (this.Z$0) {
                    return conversationNexusEvent;
                }
                return null;
            }

            @Override // defpackage.ei4
            public /* bridge */ /* synthetic */ Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Boolean bool, r02<? super ParsedNexusEvent.ConversationNexusEvent> r02Var) {
                return invoke(conversationNexusEvent, bool.booleanValue(), r02Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationViewModel(String str, LaunchMode launchMode, ArticleMetadata articleMetadata, String str2, NetworkConnectivityMonitor networkConnectivityMonitor, SoundPlayer soundPlayer, t72 t72Var, t72 t72Var2, ConversationRepository conversationRepository, final ConversationReducer conversationReducer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, SoundEffectsUseCase soundEffectsUseCase, SendSuggestionUseCase sendSuggestionUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, RefreshConversationUseCase refreshConversationUseCase, AppendPartToConversationUseCase appendPartToConversationUseCase, OpenConversationUseCase openConversationUseCase, SendMessageUseCase sendMessageUseCase, SendQuickReplyUseCase sendQuickReplyUseCase, LoadGifUseCase loadGifUseCase, ChangeInputUseCase changeInputUseCase, SendGifUseCase sendGifUseCase, MediaUploadRepository mediaUploadRepository, MediaUploadStateRepository mediaUploadStateRepository, SendMediaUseCase sendMediaUseCase, UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase, GetNetworkState getNetworkState, ShowAdminIsTypingUseCase showAdminIsTypingUseCase, SubmitAttributeUseCase submitAttributeUseCase, FallbackPollingUseCase fallbackPollingUseCase, PushNotificationsBannerUseCase pushNotificationsBannerUseCase, AudioRecordingManager audioRecordingManager, AudioRecordingUseCase audioRecordingUseCase, VoiceTranscriptionUseCase voiceTranscriptionUseCase, MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin, FinStreamingUseCase finStreamingUseCase, n72 n72Var, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer, Twig twig) {
        launchMode.getClass();
        str2.getClass();
        networkConnectivityMonitor.getClass();
        soundPlayer.getClass();
        t72Var.getClass();
        t72Var2.getClass();
        conversationRepository.getClass();
        conversationReducer.getClass();
        trackLastReceivedPartsUseCase.getClass();
        recordOpenedInteractionUseCase.getClass();
        soundEffectsUseCase.getClass();
        sendSuggestionUseCase.getClass();
        refreshUnreadConversationsCountUseCase.getClass();
        refreshConversationUseCase.getClass();
        appendPartToConversationUseCase.getClass();
        openConversationUseCase.getClass();
        sendMessageUseCase.getClass();
        sendQuickReplyUseCase.getClass();
        loadGifUseCase.getClass();
        changeInputUseCase.getClass();
        sendGifUseCase.getClass();
        mediaUploadRepository.getClass();
        mediaUploadStateRepository.getClass();
        sendMediaUseCase.getClass();
        updateFloatingIndicatorUseCase.getClass();
        getNetworkState.getClass();
        showAdminIsTypingUseCase.getClass();
        submitAttributeUseCase.getClass();
        fallbackPollingUseCase.getClass();
        pushNotificationsBannerUseCase.getClass();
        audioRecordingManager.getClass();
        audioRecordingUseCase.getClass();
        voiceTranscriptionUseCase.getClass();
        markUserContentAsSeenByAdmin.getClass();
        finStreamingUseCase.getClass();
        n72Var.getClass();
        metricTracker.getClass();
        intercomDataLayer.getClass();
        twig.getClass();
        this.initialConversationId = str;
        this.launchMode = launchMode;
        this.articleMetadata = articleMetadata;
        this.networkConnectivityMonitor = networkConnectivityMonitor;
        this.soundPlayer = soundPlayer;
        this.nexusCoroutineScope = t72Var;
        this.audioAmplitudeCoroutineScope = t72Var2;
        this.conversationRepository = conversationRepository;
        this.conversationReducer = conversationReducer;
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.sendSuggestionUseCase = sendSuggestionUseCase;
        this.refreshUnreadConversationsCountUseCase = refreshUnreadConversationsCountUseCase;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.appendPartToConversationUseCase = appendPartToConversationUseCase;
        this.openConversationUseCase = openConversationUseCase;
        this.sendMessageUseCase = sendMessageUseCase;
        this.sendQuickReplyUseCase = sendQuickReplyUseCase;
        this.loadGifUseCase = loadGifUseCase;
        this.changeInputUseCase = changeInputUseCase;
        this.sendGifUseCase = sendGifUseCase;
        this.mediaUploadRepository = mediaUploadRepository;
        this.mediaUploadStateRepository = mediaUploadStateRepository;
        this.sendMediaUseCase = sendMediaUseCase;
        this.updateFloatingIndicatorUseCase = updateFloatingIndicatorUseCase;
        this.adminIsTypingUseCase = showAdminIsTypingUseCase;
        this.submitAttributeUseCase = submitAttributeUseCase;
        this.fallbackPollingUseCase = fallbackPollingUseCase;
        this.pushNotificationsBannerUseCase = pushNotificationsBannerUseCase;
        this.audioRecordingManager = audioRecordingManager;
        this.audioRecordingUseCase = audioRecordingUseCase;
        this.voiceTranscriptionUseCase = voiceTranscriptionUseCase;
        this.markUserContentAsSeenByAdmin = markUserContentAsSeenByAdmin;
        this.finStreamingUseCase = finStreamingUseCase;
        this.dispatcher = n72Var;
        this.metricTracker = metricTracker;
        this.intercomDataLayer = intercomDataLayer;
        this.twig = twig;
        String strDecode = Uri.decode(str2);
        this.decodedInitialMessage = strDecode;
        strDecode.getClass();
        Map map = null;
        Conversation conversation = null;
        CurrentlyTypingState currentlyTypingState = null;
        BottomSheetState bottomSheetState = null;
        NetworkState networkState = null;
        List list = null;
        List list2 = null;
        FinStreamingData finStreamingData = null;
        OpenMessengerResponse openMessengerResponse = null;
        int i = 0;
        int i2 = 0;
        FloatingIndicatorState floatingIndicatorState = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        PushNotificationsBannerState pushNotificationsBannerState = null;
        VoiceTranscriptionState voiceTranscriptionState = null;
        List list3 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        final a0a a0aVarB = b0a.b(new ConversationClientState(map, conversation, str, currentlyTypingState, new ComposerState.TextInput(strDecode, new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, 0 == true ? 1 : 0), false, null, null, null, 60, null), bottomSheetState, launchMode, objArr, articleMetadata, networkState, list, list2, finStreamingData, openMessengerResponse, i, i2, floatingIndicatorState, str3, z, z2, pushNotificationsBannerState, voiceTranscriptionState, list3, 8388267, null));
        this.clientState = a0aVarB;
        this.uiState = yk2.u(new r54<ConversationUiState>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass2<T> implements s54 {
                final /* synthetic */ s54 $this_unsafeFlow;
                final /* synthetic */ ConversationReducer receiver$inlined;

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2", f = "ConversationViewModel.kt", l = {50}, m = "emit")
                public static final class AnonymousClass1 extends u02 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(r02 r02Var) {
                        super(r02Var);
                    }

                    @Override // defpackage.ak0
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(s54 s54Var, ConversationReducer conversationReducer) {
                    this.$this_unsafeFlow = s54Var;
                    this.receiver$inlined = conversationReducer;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.s54
                public final Object emit(Object obj, r02 r02Var) throws Throwable {
                    AnonymousClass1 anonymousClass1;
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
                    Object obj2 = anonymousClass1.result;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        dv8.b(obj2);
                        s54 s54Var = this.$this_unsafeFlow;
                        ConversationUiState conversationUiStateComputeUiState$intercom_sdk_base_release = this.receiver$inlined.computeUiState$intercom_sdk_base_release((ConversationClientState) obj);
                        anonymousClass1.label = 1;
                        Object objEmit = s54Var.emit(conversationUiStateComputeUiState$intercom_sdk_base_release, anonymousClass1);
                        v72 v72Var = v72.t;
                        if (objEmit == v72Var) {
                            return v72Var;
                        }
                    } else {
                        if (i2 != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj2);
                    }
                    return g2b.a;
                }
            }

            @Override // defpackage.r54
            public Object collect(s54<? super ConversationUiState> s54Var, r02 r02Var) {
                Object objCollect = a0aVarB.collect(new AnonymousClass2(s54Var, conversationReducer), r02Var);
                return objCollect == v72.t ? objCollect : g2b.a;
            }
        }, rhb.b(this), new uz9(5000L, Long.MAX_VALUE), InitialStateReducerKt.reduceInitialState(((ConversationClientState) a0aVarB.getValue()).getLaunchMode()));
        this.gifQueryStateFlow = b0a.b(SearchQuery.None.INSTANCE);
        am9 am9VarB = ty1.b(7, null);
        this._uiEffect = am9VarB;
        this.uiEffect = yk2.s(am9VarB, rhb.b(this), um9.a.a, 0);
        am9 am9VarB2 = ty1.b(7, null);
        this._composerUiEffect = am9VarB2;
        this.composerUiEffect = yk2.s(am9VarB2, rhb.b(this), um9.a.a, 0);
        this.resumedState = b0a.b(Boolean.FALSE);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass1(null), 2);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass2(null), 2);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass3(null), 2);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass4(null), 2);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass5(null), 2);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass6(getNetworkState, this, null), 2);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass7(null), 2);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass8(null), 2);
        if (str == null) {
            Injector.get().getDataLayer().clearOpenResponse();
        }
        loadConversation();
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$6", f = "ConversationViewModel.kt", l = {344}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ GetNetworkState $getNetworkState;
        int label;
        final /* synthetic */ ConversationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(GetNetworkState getNetworkState, ConversationViewModel conversationViewModel, r02<? super AnonymousClass6> r02Var) {
            super(2, r02Var);
            this.$getNetworkState = getNetworkState;
            this.this$0 = conversationViewModel;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new AnonymousClass6(this.$getNetworkState, this.this$0, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass6) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                r54 r54VarI = yk2.i(this.$getNetworkState.invoke());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                this.label = 1;
                Object objCollect = r54VarI.collect(anonymousClass1, this);
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
            return g2b.a;
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class AnonymousClass1<T> implements s54 {
            final /* synthetic */ ConversationViewModel this$0;

            public AnonymousClass1(ConversationViewModel conversationViewModel) {
                this.this$0 = conversationViewModel;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit(NetworkState networkState, r02<? super g2b> r02Var) throws Throwable {
                ConversationViewModel$6$1$emit$1 conversationViewModel$6$1$emit$1;
                Object value;
                AnonymousClass1<T> anonymousClass1 = this;
                NetworkState networkState2 = networkState;
                if (r02Var instanceof ConversationViewModel$6$1$emit$1) {
                    conversationViewModel$6$1$emit$1 = (ConversationViewModel$6$1$emit$1) r02Var;
                    int i = conversationViewModel$6$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        conversationViewModel$6$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        conversationViewModel$6$1$emit$1 = new ConversationViewModel$6$1$emit$1(anonymousClass1, r02Var);
                    }
                } else {
                    conversationViewModel$6$1$emit$1 = new ConversationViewModel$6$1$emit$1(anonymousClass1, r02Var);
                }
                Object obj = conversationViewModel$6$1$emit$1.result;
                int i2 = conversationViewModel$6$1$emit$1.label;
                if (i2 == 0) {
                    dv8.b(obj);
                    if (xj5.a(networkState2, NetworkState.Reconnected.INSTANCE)) {
                        OpenConversationUseCase openConversationUseCase = anonymousClass1.this$0.openConversationUseCase;
                        i37<ConversationClientState> i37Var = anonymousClass1.this$0.clientState;
                        GetConversationReason getConversationReason = GetConversationReason.NETWORK_CONNECTED;
                        conversationViewModel$6$1$emit$1.L$0 = anonymousClass1;
                        conversationViewModel$6$1$emit$1.L$1 = networkState2;
                        conversationViewModel$6$1$emit$1.label = 1;
                        Object objInvoke = openConversationUseCase.invoke(i37Var, getConversationReason, conversationViewModel$6$1$emit$1);
                        v72 v72Var = v72.t;
                        if (objInvoke == v72Var) {
                            return v72Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    NetworkState networkState3 = (NetworkState) conversationViewModel$6$1$emit$1.L$1;
                    AnonymousClass1<T> anonymousClass2 = (AnonymousClass1) conversationViewModel$6$1$emit$1.L$0;
                    dv8.b(obj);
                    networkState2 = networkState3;
                    anonymousClass1 = anonymousClass2;
                }
                NetworkState networkState4 = networkState2;
                i37 i37Var2 = anonymousClass1.this$0.clientState;
                do {
                    value = i37Var2.getValue();
                } while (!i37Var2.c(value, ConversationClientState.copy$default((ConversationClientState) value, null, null, null, null, null, null, null, null, null, networkState4, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388095, null)));
                return g2b.a;
            }

            @Override // defpackage.s54
            public /* bridge */ /* synthetic */ Object emit(Object obj, r02 r02Var) {
                return emit((NetworkState) obj, (r02<? super g2b>) r02Var);
            }
        }
    }
}
