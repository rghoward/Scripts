package io.intercom.android.sdk.tickets.create.model;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.intercom.twig.BuildConfig;
import defpackage.a0a;
import defpackage.aa0;
import defpackage.am9;
import defpackage.b0a;
import defpackage.cb2;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.eb2;
import defpackage.et2;
import defpackage.f37;
import defpackage.fb2;
import defpackage.fl;
import defpackage.g2b;
import defpackage.gb2;
import defpackage.hb2;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.i23;
import defpackage.i37;
import defpackage.in0;
import defpackage.lb2;
import defpackage.ll8;
import defpackage.mh4;
import defpackage.mhb;
import defpackage.n72;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.pi1;
import defpackage.px1;
import defpackage.qq2;
import defpackage.r02;
import defpackage.rhb;
import defpackage.s54;
import defpackage.sd1;
import defpackage.t72;
import defpackage.th1;
import defpackage.thb;
import defpackage.ty1;
import defpackage.u;
import defpackage.uhb;
import defpackage.uo2;
import defpackage.v72;
import defpackage.vhb;
import defpackage.whb;
import defpackage.wn5;
import defpackage.wr2;
import defpackage.wt4;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.z;
import defpackage.z90;
import defpackage.zl9;
import defpackage.zz9;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.tickets.create.reducers.ConditionalAttributesReducerKt;
import io.intercom.android.sdk.tickets.create.reducers.CreateTicketReducerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketViewModel extends mhb {
    private final f37<TicketSideEffect> _effect;
    private final i37<CreateTicketFormUiState> _uiState;
    private final Context applicationContext;
    private final AppConfig config;
    private final String conversationId;
    private TicketTypeV2 currentTicketType;
    private final n72 dispatcher;
    private final zl9<TicketSideEffect> effect;
    private CreateTicketFormUiState.Content lastKnownContentState;
    private final CreateTicketLaunchedFrom launchedFrom;
    private final MetricTracker metricTracker;
    private final TicketRepository ticketRepository;
    private final long ticketTypeId;
    private final zz9<CreateTicketFormUiState> uiState;
    private final UserIdentity userIdentity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$1", f = "CreateTicketViewModel.kt", l = {86}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return CreateTicketViewModel.this.new AnonymousClass1(r02Var);
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
                i37 i37Var = CreateTicketViewModel.this._uiState;
                final CreateTicketViewModel createTicketViewModel = CreateTicketViewModel.this;
                s54 s54Var = new s54() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.1.1
                    public final Object emit(CreateTicketFormUiState createTicketFormUiState, r02<? super g2b> r02Var) {
                        if (createTicketFormUiState instanceof CreateTicketFormUiState.Content) {
                            createTicketViewModel.lastKnownContentState = (CreateTicketFormUiState.Content) createTicketFormUiState;
                        }
                        return g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((CreateTicketFormUiState) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                Object objCollect = i37Var.collect(s54Var, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1", f = "CreateTicketViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C04021 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ List<Answer.MediaAnswer.MediaItem> $mediaItems;
        int label;
        final /* synthetic */ CreateTicketViewModel this$0;

        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1$1", f = "CreateTicketViewModel.kt", l = {358, 378}, m = "invokeSuspend")
        public static final class C01761 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            final /* synthetic */ List<Answer.MediaAnswer.MediaItem> $itemsToUpload;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ CreateTicketViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01761(List<Answer.MediaAnswer.MediaItem> list, CreateTicketViewModel createTicketViewModel, r02<? super C01761> r02Var) {
                super(2, r02Var);
                this.$itemsToUpload = list;
                this.this$0 = createTicketViewModel;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C01761(this.$itemsToUpload, this.this$0, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C01761) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x004e  */
            /* JADX WARN: Code duplicated, block: B:16:0x0071  */
            /* JADX WARN: Code duplicated, block: B:19:0x007d  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007d -> B:20:0x00b7). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00cc -> B:24:0x00cf). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.ak0
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 296
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.C04021.C01761.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04021(List<Answer.MediaAnswer.MediaItem> list, CreateTicketViewModel createTicketViewModel, r02<? super C04021> r02Var) {
            super(2, r02Var);
            this.$mediaItems = list;
            this.this$0 = createTicketViewModel;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new C04021(this.$mediaItems, this.this$0, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C04021) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            List<Answer.MediaAnswer.MediaItem> list = this.$mediaItems;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (xj5.a(((Answer.MediaAnswer.MediaItem) obj2).getUploadStatus(), Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                Answer.MediaAnswer.MediaItem mediaItem = (Answer.MediaAnswer.MediaItem) obj3;
                mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE);
                arrayList2.add(mediaItem);
            }
            oy0.d(rhb.b(this.this$0), this.this$0.dispatcher, null, new C01761(arrayList2, this.this$0, null), 2);
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$fetchTicketType$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$fetchTicketType$1", f = "CreateTicketViewModel.kt", l = {105}, m = "invokeSuspend")
    public static final class C04031 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ List<TicketAttributeRequest> $attributes;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04031(List<TicketAttributeRequest> list, r02<? super C04031> r02Var) {
            super(2, r02Var);
            this.$attributes = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invokeSuspend$lambda$0(CreateTicketViewModel createTicketViewModel, List list) {
            createTicketViewModel.fetchTicketType(list);
            return g2b.a;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return CreateTicketViewModel.this.new C04031(this.$attributes, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C04031) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            i37 i37Var;
            Object error;
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                i37Var = CreateTicketViewModel.this._uiState;
                TicketRepository ticketRepository = CreateTicketViewModel.this.ticketRepository;
                long j = CreateTicketViewModel.this.ticketTypeId;
                List<TicketAttributeRequest> list = this.$attributes;
                this.L$0 = i37Var;
                this.label = 1;
                obj = ticketRepository.fetchTicketType(j, list, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i37Var = (i37) this.L$0;
                dv8.b(obj);
            }
            NetworkResponse networkResponse = (NetworkResponse) obj;
            if (networkResponse instanceof NetworkResponse.Success) {
                TicketTypeV2 ticketTypeV2 = (TicketTypeV2) ((NetworkResponse.Success) networkResponse).getBody();
                CreateTicketViewModel.this.currentTicketType = ticketTypeV2;
                error = CreateTicketReducerKt.convertToTicketFormUiState(ticketTypeV2, CreateTicketViewModel.this.userIdentity, CreateTicketViewModel.this.config, CreateTicketViewModel.this.getLastKnownContent());
            } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                error = new CreateTicketFormUiState.Error(new ErrorState.WithoutCTA(0, 0, new Integer(R.string.intercom_error_loading_ticket), 3, null));
            } else {
                if (!(networkResponse instanceof NetworkResponse.NetworkError)) {
                    u.b();
                    return null;
                }
                Integer num = new Integer(R.string.intercom_error_loading_ticket);
                final CreateTicketViewModel createTicketViewModel = CreateTicketViewModel.this;
                final List<TicketAttributeRequest> list2 = this.$attributes;
                error = new CreateTicketFormUiState.Error(new ErrorState.WithCTA(0, 0, num, 0, new mh4() { // from class: io.intercom.android.sdk.tickets.create.model.c
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return CreateTicketViewModel.C04031.invokeSuspend$lambda$0(createTicketViewModel, list2);
                    }
                }, 11, null));
            }
            i37Var.setValue(error);
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerClicked$1", f = "CreateTicketViewModel.kt", l = {413}, m = "invokeSuspend")
    public static final class C04041 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ AnswerClickData $answerClickData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04041(AnswerClickData answerClickData, r02<? super C04041> r02Var) {
            super(2, r02Var);
            this.$answerClickData = answerClickData;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return CreateTicketViewModel.this.new C04041(this.$answerClickData, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C04041) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                f37 f37Var = CreateTicketViewModel.this._effect;
                TicketSideEffect.AnswerClicked answerClicked = new TicketSideEffect.AnswerClicked(this.$answerClickData);
                this.label = 1;
                Object objEmit = f37Var.emit(answerClicked, this);
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

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateTicketViewModel(CreateTicketLaunchedFrom createTicketLaunchedFrom, TicketRepository ticketRepository, UserIdentity userIdentity, AppConfig appConfig, n72 n72Var, MetricTracker metricTracker, String str, long j, Context context, int i, qq2 qq2Var) {
        n72 n72Var2;
        TicketRepository ticketRepository2 = (i & 2) != 0 ? new TicketRepository(null, null, null, null, null, 31, null) : ticketRepository;
        UserIdentity userIdentity2 = (i & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity;
        AppConfig appConfig2 = (i & 8) != 0 ? (AppConfig) z.a() : appConfig;
        if ((i & 16) != 0) {
            et2 et2Var = i23.a;
            n72Var2 = wr2.v;
        } else {
            n72Var2 = n72Var;
        }
        this(createTicketLaunchedFrom, ticketRepository2, userIdentity2, appConfig2, n72Var2, (i & 32) != 0 ? Injector.get().getMetricTracker() : metricTracker, str, j, (i & 256) != 0 ? Injector.get().getApplication() : context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canRetryFileLimitExceededError(Answer.MediaAnswer.MediaItem mediaItem, int i, int i2) {
        if (!(mediaItem.getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error)) {
            return false;
        }
        Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
        uploadStatus.getClass();
        return (((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError() instanceof Answer.MediaAnswer.FileUploadError.FileLimitExceeded) && i < i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void compressAndUploadFileAttachments(List<Answer.MediaAnswer.MediaItem> list) {
        oy0.d(rhb.b(this), this.dispatcher, null, new C04021(list, this, null), 2);
    }

    public static /* synthetic */ void createTicket$default(CreateTicketViewModel createTicketViewModel, t72 t72Var, int i, Object obj) {
        if ((i & 1) != 0) {
            t72Var = null;
        }
        createTicketViewModel.createTicket(t72Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b createTicket$lambda$0(CreateTicketViewModel createTicketViewModel, t72 t72Var, CreateTicketFormUiState.Content content) {
        content.getClass();
        oy0.d(rhb.b(createTicketViewModel), createTicketViewModel.dispatcher, null, new CreateTicketViewModel$createTicket$1$1(content, createTicketViewModel, t72Var, null), 2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchTicketType(List<TicketAttributeRequest> list) {
        oy0.d(rhb.b(this), this.dispatcher, null, new C04031(list, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchTicketType$default(CreateTicketViewModel createTicketViewModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hf3.t;
        }
        createTicketViewModel.fetchTicketType(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TicketAttributeRequest> getAttributeRequest() {
        ArrayList arrayList = new ArrayList();
        withState(new gb2(0, arrayList));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b getAttributeRequest$lambda$6(List list, CreateTicketFormUiState.Content content) {
        content.getClass();
        List<QuestionState> questions = content.getQuestions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : questions) {
            if (!xj5.a(((QuestionState) obj).getQuestionModel().getId(), CreateTicketViewModelKt.EmailId)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            QuestionState questionState = (QuestionState) obj2;
            Object answerForServer = CreateTicketViewModelKt.formatAnswerForServer(questionState);
            if (!xj5.a(answerForServer, g2b.a)) {
                list.add(new TicketAttributeRequest(questionState.getQuestionModel().getId(), answerForServer));
            }
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreateTicketFormUiState getLastKnownContent() {
        return this._uiState.getValue() instanceof CreateTicketFormUiState.Content ? this._uiState.getValue() : this.lastKnownContentState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFileSizeExceeded(MediaData.Media media) {
        return media.getSize() > this.config.getAttachmentSettings().getUploadSizeLimit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUnsupportedFileType(MediaData.Media media, Set<String> set) {
        return !th1.u(set, MimeTypeMap.getSingleton().getExtensionFromMimeType(media.getMimeType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b onAnswerUpdated$lambda$3(String str, CreateTicketViewModel createTicketViewModel, CreateTicketFormUiState.Content content) {
        content.getClass();
        List<TicketAttributeRequest> listReduceAttributeList = ConditionalAttributesReducerKt.reduceAttributeList(str, createTicketViewModel.currentTicketType, content);
        if (!listReduceAttributeList.isEmpty()) {
            createTicketViewModel.withState(new fb2(0, createTicketViewModel));
            createTicketViewModel.fetchTicketType(listReduceAttributeList);
        }
        oy0.d(rhb.b(createTicketViewModel), createTicketViewModel.dispatcher, null, new CreateTicketViewModel$onAnswerUpdated$1$2(content, createTicketViewModel, null), 2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b onAnswerUpdated$lambda$3$lambda$2$lambda$1(CreateTicketViewModel createTicketViewModel, CreateTicketFormUiState.Content content) {
        content.getClass();
        createTicketViewModel._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, null, null, true, false, 11, null));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b onDeleteFileClicked$lambda$11(AnswerClickData answerClickData, CreateTicketViewModel createTicketViewModel, CreateTicketFormUiState.Content content) {
        content.getClass();
        for (QuestionState questionState : content.getQuestions()) {
            if (xj5.a(questionState.getQuestionModel().getId(), answerClickData.getQuestionId())) {
                Answer answer = questionState.getAnswer();
                answer.getClass();
                questionState.setAnswer(new Answer.MediaAnswer(th1.J(((Answer.MediaAnswer) answer).getMediaItems(), answerClickData.getClickedItem())));
                createTicketViewModel.onAnswerUpdated(answerClickData.getQuestionId());
                return g2b.a;
            }
        }
        px1.b("Collection contains no element matching the predicate.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b onRetryFileClicked$lambda$9(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData, CreateTicketFormUiState.Content content) {
        content.getClass();
        for (QuestionState questionState : content.getQuestions()) {
            if (xj5.a(questionState.getQuestionModel().getId(), answerClickData.getQuestionId())) {
                Answer answer = questionState.getAnswer();
                answer.getClass();
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                for (Answer.MediaAnswer.MediaItem mediaItem : mediaAnswer.getMediaItems()) {
                    if (xj5.a(mediaItem, answerClickData.getClickedItem())) {
                        mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.None.INSTANCE);
                        questionState.setAnswer(new Answer.MediaAnswer(mediaAnswer.getMediaItems()));
                        createTicketViewModel.onAnswerUpdated(answerClickData.getQuestionId());
                        return g2b.a;
                    }
                }
                px1.b("Collection contains no element matching the predicate.");
                return null;
            }
        }
        px1.b("Collection contains no element matching the predicate.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCtaState() {
        withState(new in0(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b updateCtaState$lambda$14(CreateTicketViewModel createTicketViewModel, CreateTicketFormUiState.Content content) {
        content.getClass();
        List<QuestionState> questions = content.getQuestions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : questions) {
            if (((QuestionState) obj).getQuestionModel() instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            QuestionState questionState = (QuestionState) obj2;
            questionState.validate();
            if (questionState.getAnswer() instanceof Answer.MediaAnswer) {
                Answer answer = questionState.getAnswer();
                answer.getClass();
                List<Answer.MediaAnswer.MediaItem> mediaItems = ((Answer.MediaAnswer) answer).getMediaItems();
                if (mediaItems == null || !mediaItems.isEmpty()) {
                    Iterator<T> it = mediaItems.iterator();
                    while (it.hasNext()) {
                        if (!(((Answer.MediaAnswer.MediaItem) it.next()).getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Success)) {
                            createTicketViewModel._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, null, null, false, false, 7, null));
                            return g2b.a;
                        }
                        size = size;
                        content = content;
                    }
                }
            }
            size = size;
            content = content;
        }
        createTicketViewModel._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, null, null, false, true, 7, null));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withState(oh4<? super CreateTicketFormUiState.Content, g2b> oh4Var) {
        if (this._uiState.getValue() instanceof CreateTicketFormUiState.Content) {
            CreateTicketFormUiState value = this._uiState.getValue();
            value.getClass();
            oh4Var.invoke((CreateTicketFormUiState.Content) value);
        }
    }

    public final void createTicket(final t72 t72Var) {
        MetricTracker metricTracker = this.metricTracker;
        Long lValueOf = Long.valueOf(this.ticketTypeId);
        String str = this.conversationId;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        metricTracker.submittedCreateTicketForm(lValueOf, str, this.launchedFrom.getFrom());
        withState(new oh4() { // from class: db2
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                return CreateTicketViewModel.createTicket$lambda$0(this.t, t72Var, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            }
        });
    }

    public final zl9<TicketSideEffect> getEffect() {
        return this.effect;
    }

    public final zz9<CreateTicketFormUiState> getUiState() {
        return this.uiState;
    }

    public final void onAnswerClicked(AnswerClickData answerClickData) {
        answerClickData.getClass();
        oy0.d(rhb.b(this), null, null, new C04041(answerClickData, null), 3);
    }

    public final void onAnswerUpdated(String str) {
        str.getClass();
        withState(new hb2(0, str, this));
    }

    public final void onDeleteFileClicked(AnswerClickData answerClickData) {
        answerClickData.getClass();
        withState(new eb2(0, answerClickData, this));
    }

    public final void onRetryFileClicked(AnswerClickData answerClickData) {
        answerClickData.getClass();
        withState(new cb2(0, this, answerClickData));
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$Companion$factory$1] */
        private final CreateTicketViewModel$Companion$factory$1 factory(final long j, final String str, final CreateTicketLaunchedFrom createTicketLaunchedFrom) {
            return new thb.c() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$Companion$factory$1
                @Override // thb.c
                public <T extends mhb> T create(Class<T> cls) {
                    cls.getClass();
                    return new CreateTicketViewModel(createTicketLaunchedFrom, null, null, null, null, null, str, j, null, 318, null);
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

        public final CreateTicketViewModel create(whb whbVar, long j, String str, CreateTicketLaunchedFrom createTicketLaunchedFrom) {
            whbVar.getClass();
            createTicketLaunchedFrom.getClass();
            CreateTicketViewModel$Companion$factory$1 createTicketViewModel$Companion$factory$1Factory = factory(j, str, createTicketLaunchedFrom);
            createTicketViewModel$Companion$factory$1Factory.getClass();
            vhb viewModelStore = whbVar.getViewModelStore();
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            uhb uhbVar = new uhb(viewModelStore, createTicketViewModel$Companion$factory$1Factory, defaultViewModelCreationExtras);
            sd1 sd1VarA = ll8.a(CreateTicketViewModel.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (CreateTicketViewModel) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class CreateTicketFormUiState {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Error extends CreateTicketFormUiState {
            public static final int $stable = 0;
            private final ErrorState errorState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(ErrorState errorState) {
                super(null);
                errorState.getClass();
                this.errorState = errorState;
            }

            public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i, Object obj) {
                if ((i & 1) != 0) {
                    errorState = error.errorState;
                }
                return error.copy(errorState);
            }

            public final ErrorState component1() {
                return this.errorState;
            }

            public final Error copy(ErrorState errorState) {
                errorState.getClass();
                return new Error(errorState);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && xj5.a(this.errorState, ((Error) obj).errorState);
            }

            public final ErrorState getErrorState() {
                return this.errorState;
            }

            public int hashCode() {
                return this.errorState.hashCode();
            }

            public String toString() {
                return "Error(errorState=" + this.errorState + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Initial extends CreateTicketFormUiState {
            public static final int $stable = 0;
            public static final Initial INSTANCE = new Initial();

            private Initial() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Initial);
            }

            public int hashCode() {
                return 1870846745;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Loading extends CreateTicketFormUiState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public int hashCode() {
                return 259155217;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ CreateTicketFormUiState(qq2 qq2Var) {
            this();
        }

        private CreateTicketFormUiState() {
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Content extends CreateTicketFormUiState {
            public static final int $stable = 8;
            private final boolean enableCta;
            private final List<QuestionState> questions;
            private final boolean showCreatingTicketProgress;
            private final String title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Content(String str, List<QuestionState> list, boolean z, boolean z2) {
                super(null);
                str.getClass();
                list.getClass();
                this.title = str;
                this.questions = list;
                this.showCreatingTicketProgress = z;
                this.enableCta = z2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Content copy$default(Content content, String str, List list, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = content.title;
                }
                if ((i & 2) != 0) {
                    list = content.questions;
                }
                if ((i & 4) != 0) {
                    z = content.showCreatingTicketProgress;
                }
                if ((i & 8) != 0) {
                    z2 = content.enableCta;
                }
                return content.copy(str, list, z, z2);
            }

            public final String component1() {
                return this.title;
            }

            public final List<QuestionState> component2() {
                return this.questions;
            }

            public final boolean component3() {
                return this.showCreatingTicketProgress;
            }

            public final boolean component4() {
                return this.enableCta;
            }

            public final Content copy(String str, List<QuestionState> list, boolean z, boolean z2) {
                str.getClass();
                list.getClass();
                return new Content(str, list, z, z2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return xj5.a(this.title, content.title) && xj5.a(this.questions, content.questions) && this.showCreatingTicketProgress == content.showCreatingTicketProgress && this.enableCta == content.enableCta;
            }

            public final boolean getEnableCta() {
                return this.enableCta;
            }

            public final List<QuestionState> getQuestions() {
                return this.questions;
            }

            public final boolean getShowCreatingTicketProgress() {
                return this.showCreatingTicketProgress;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return Boolean.hashCode(this.enableCta) + uo2.a(ho2.a(this.title.hashCode() * 31, 31, this.questions), this.showCreatingTicketProgress, 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Content(title=");
                sb.append(this.title);
                sb.append(", questions=");
                sb.append(this.questions);
                sb.append(", showCreatingTicketProgress=");
                sb.append(this.showCreatingTicketProgress);
                sb.append(", enableCta=");
                return pi1.a(sb, this.enableCta, ')');
            }

            public /* synthetic */ Content(String str, List list, boolean z, boolean z2, int i, qq2 qq2Var) {
                this(str, list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class TicketSideEffect {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class AnswerClicked extends TicketSideEffect {
            public static final int $stable = 8;
            private final AnswerClickData answerClickData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnswerClicked(AnswerClickData answerClickData) {
                super(null);
                answerClickData.getClass();
                this.answerClickData = answerClickData;
            }

            public static /* synthetic */ AnswerClicked copy$default(AnswerClicked answerClicked, AnswerClickData answerClickData, int i, Object obj) {
                if ((i & 1) != 0) {
                    answerClickData = answerClicked.answerClickData;
                }
                return answerClicked.copy(answerClickData);
            }

            public final AnswerClickData component1() {
                return this.answerClickData;
            }

            public final AnswerClicked copy(AnswerClickData answerClickData) {
                answerClickData.getClass();
                return new AnswerClicked(answerClickData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AnswerClicked) && xj5.a(this.answerClickData, ((AnswerClicked) obj).answerClickData);
            }

            public final AnswerClickData getAnswerClickData() {
                return this.answerClickData;
            }

            public int hashCode() {
                return this.answerClickData.hashCode();
            }

            public String toString() {
                return "AnswerClicked(answerClickData=" + this.answerClickData + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Finish extends TicketSideEffect {
            public static final int $stable = 0;
            public static final Finish INSTANCE = new Finish();

            private Finish() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Finish);
            }

            public int hashCode() {
                return -1916377057;
            }

            public String toString() {
                return "Finish";
            }
        }

        public /* synthetic */ TicketSideEffect(qq2 qq2Var) {
            this();
        }

        private TicketSideEffect() {
        }
    }

    public CreateTicketViewModel(CreateTicketLaunchedFrom createTicketLaunchedFrom, TicketRepository ticketRepository, UserIdentity userIdentity, AppConfig appConfig, n72 n72Var, MetricTracker metricTracker, String str, long j, Context context) {
        createTicketLaunchedFrom.getClass();
        ticketRepository.getClass();
        userIdentity.getClass();
        appConfig.getClass();
        n72Var.getClass();
        metricTracker.getClass();
        context.getClass();
        this.launchedFrom = createTicketLaunchedFrom;
        this.ticketRepository = ticketRepository;
        this.userIdentity = userIdentity;
        this.config = appConfig;
        this.dispatcher = n72Var;
        this.metricTracker = metricTracker;
        this.conversationId = str;
        this.ticketTypeId = j;
        this.applicationContext = context;
        a0a a0aVarB = b0a.b(CreateTicketFormUiState.Initial.INSTANCE);
        this._uiState = a0aVarB;
        this.uiState = yk2.b(a0aVarB);
        am9 am9VarB = ty1.b(7, null);
        this._effect = am9VarB;
        this.effect = yk2.a(am9VarB);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass1(null), 2);
        metricTracker.viewedCreateTicketForm(Long.valueOf(j), str == null ? BuildConfig.FLAVOR : str, createTicketLaunchedFrom.getFrom());
        fetchTicketType$default(this, null, 1, null);
    }
}
