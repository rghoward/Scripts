package io.intercom.android.sdk.m5.data;

import defpackage.a47;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.r02;
import defpackage.u02;
import defpackage.v72;
import defpackage.x37;
import defpackage.xm2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.UsersResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CommonRepository {
    public static final int $stable = 8;
    private final IntercomDataLayer intercomDataLayer;
    private final MessengerApi messengerApi;
    private final x37 openMutex;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.CommonRepository$fetchUnreadCounts$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.data.CommonRepository", f = "CommonRepository.kt", l = {39}, m = "fetchUnreadCounts")
    public static final class AnonymousClass1 extends u02 {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonRepository.this.fetchUnreadCounts(this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.CommonRepository$openMessenger$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.data.CommonRepository", f = "CommonRepository.kt", l = {53, 29}, m = "openMessenger")
    public static final class C03611 extends u02 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03611(r02<? super C03611> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonRepository.this.openMessenger(this);
        }
    }

    public CommonRepository(MessengerApi messengerApi, IntercomDataLayer intercomDataLayer) {
        messengerApi.getClass();
        intercomDataLayer.getClass();
        this.messengerApi = messengerApi;
        this.intercomDataLayer = intercomDataLayer;
        this.openMutex = new a47();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchUnreadCounts(r02<? super UsersResponse> r02Var) throws Throwable {
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
        Object unreadConversationsSuspended$default = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            dv8.b(unreadConversationsSuspended$default);
            MessengerApi messengerApi = this.messengerApi;
            anonymousClass1.label = 1;
            unreadConversationsSuspended$default = MessengerApi.DefaultImpls.getUnreadConversationsSuspended$default(messengerApi, null, anonymousClass1, 1, null);
            v72 v72Var = v72.t;
            if (unreadConversationsSuspended$default == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(unreadConversationsSuspended$default);
        }
        NetworkResponse networkResponse = (NetworkResponse) unreadConversationsSuspended$default;
        if (networkResponse instanceof NetworkResponse.Success) {
            return ((UsersResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:35:0x009c, B:37:0x00a2, B:39:0x00bf, B:40:0x00c1), top: B:46:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:35:0x009c, B:37:0x00a2, B:39:0x00bf, B:40:0x00c1), top: B:46:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object openMessenger(r02<? super NetworkResponse<OpenMessengerResponse>> r02Var) {
        C03611 c03611;
        x37 x37Var;
        Throwable th;
        x37 x37Var2;
        CommonRepository commonRepository;
        NetworkResponse success;
        NetworkResponse networkResponse;
        TeamPresence teamPresence;
        if (r02Var instanceof C03611) {
            c03611 = (C03611) r02Var;
            int i = c03611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03611.label = i - Integer.MIN_VALUE;
            } else {
                c03611 = new C03611(r02Var);
            }
        } else {
            c03611 = new C03611(r02Var);
        }
        Object obj = c03611.result;
        int i2 = c03611.label;
        v72 v72Var = v72.t;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                x37Var = this.openMutex;
                c03611.L$0 = this;
                c03611.L$1 = x37Var;
                c03611.label = 1;
                if (x37Var.b(c03611) != v72Var) {
                }
                return v72Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x37Var2 = (x37) c03611.L$1;
                commonRepository = (CommonRepository) c03611.L$0;
                try {
                    dv8.b(obj);
                    networkResponse = (NetworkResponse) obj;
                    if (networkResponse instanceof NetworkResponse.Success) {
                        commonRepository.intercomDataLayer.updateOpenResponse((OpenMessengerResponse) ((NetworkResponse.Success) networkResponse).getBody());
                        teamPresence = ((OpenMessengerResponse) ((NetworkResponse.Success) networkResponse).getBody()).getTeamPresence();
                        if (teamPresence == null) {
                            teamPresence = TeamPresence.NULL;
                        }
                        commonRepository.intercomDataLayer.updateTeamPresence(teamPresence);
                    }
                    x37Var = x37Var2;
                    success = networkResponse;
                    x37Var.c(null);
                    return success;
                } catch (Throwable th2) {
                    th = th2;
                    x37Var2.c(null);
                    throw th;
                }
            }
            x37 x37Var3 = (x37) c03611.L$1;
            CommonRepository commonRepository2 = (CommonRepository) c03611.L$0;
            dv8.b(obj);
            x37Var = x37Var3;
            this = commonRepository2;
            OpenMessengerResponse openResponse = this.intercomDataLayer.getOpenResponse();
            if (openResponse == null) {
                if (!Injector.get().getAblyManager().isConnected()) {
                    Injector.get().getAblyManager().connect();
                }
                MessengerApi messengerApi = this.messengerApi;
                c03611.L$0 = this;
                c03611.L$1 = x37Var;
                c03611.label = 2;
                Object objOpenMessengerSuspended$default = MessengerApi.DefaultImpls.openMessengerSuspended$default(messengerApi, null, c03611, 1, null);
                if (objOpenMessengerSuspended$default != v72Var) {
                    commonRepository = this;
                    x37Var2 = x37Var;
                    obj = objOpenMessengerSuspended$default;
                    networkResponse = (NetworkResponse) obj;
                    if (networkResponse instanceof NetworkResponse.Success) {
                        commonRepository.intercomDataLayer.updateOpenResponse((OpenMessengerResponse) ((NetworkResponse.Success) networkResponse).getBody());
                        teamPresence = ((OpenMessengerResponse) ((NetworkResponse.Success) networkResponse).getBody()).getTeamPresence();
                        if (teamPresence == null) {
                            teamPresence = TeamPresence.NULL;
                        }
                        commonRepository.intercomDataLayer.updateTeamPresence(teamPresence);
                    }
                    x37Var = x37Var2;
                    success = networkResponse;
                }
                return v72Var;
            }
            success = new NetworkResponse.Success(openResponse);
            x37Var.c(null);
            return success;
        } catch (Throwable th3) {
            x37 x37Var4 = x37Var;
            th = th3;
            x37Var2 = x37Var4;
            x37Var2.c(null);
            throw th;
        }
    }
}
