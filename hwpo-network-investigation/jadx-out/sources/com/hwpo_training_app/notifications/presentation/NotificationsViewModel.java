package com.hwpo_training_app.notifications.presentation;

import com.hwpo_training_app.R;
import com.hwpo_training_app.notifications.domain.ClearNotificationsUseCase;
import com.hwpo_training_app.notifications.domain.FetchNotificationsUseCase;
import com.hwpo_training_app.notifications.domain.ObserverNotificationsFlowUseCase;
import defpackage.aa0;
import defpackage.bl0;
import defpackage.bu8;
import defpackage.ci4;
import defpackage.cm3;
import defpackage.dl0;
import defpackage.dm9;
import defpackage.dv8;
import defpackage.dx1;
import defpackage.dz9;
import defpackage.ec6;
import defpackage.el0;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.hf3;
import defpackage.ix3;
import defpackage.ji8;
import defpackage.jx3;
import defpackage.k74;
import defpackage.kd7;
import defpackage.ml;
import defpackage.oh7;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.r02;
import defpackage.r54;
import defpackage.rhb;
import defpackage.s54;
import defpackage.t72;
import defpackage.u02;
import defpackage.v56;
import defpackage.v72;
import defpackage.vz7;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.yq6;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationsViewModel extends dl0<NotificationsViewState, Action> {
    public static final Companion Companion = new Companion(0);
    public final t72 A;
    public final bu8 B;
    public final cm3 C;
    public final yq6 D;
    public final yq6 E;
    public final yq6 F;
    public final dm9 x;
    public final FetchNotificationsUseCase y;
    public final ClearNotificationsUseCase z;

    /* JADX INFO: renamed from: com.hwpo_training_app.notifications.presentation.NotificationsViewModel$onCleared$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.notifications.presentation.NotificationsViewModel$onCleared$1", f = "NotificationsViewModel.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return NotificationsViewModel.this.new AnonymousClass1(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                ClearNotificationsUseCase clearNotificationsUseCase = NotificationsViewModel.this.z;
                g2b g2bVar = g2b.a;
                this.t = 1;
                clearNotificationsUseCase.getClass();
                Object objB = g5b.b(clearNotificationsUseCase, g2bVar, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel(dm9 dm9Var, FetchNotificationsUseCase fetchNotificationsUseCase, ObserverNotificationsFlowUseCase observerNotificationsFlowUseCase, kd7 kd7Var, ClearNotificationsUseCase clearNotificationsUseCase, t72 t72Var, bu8 bu8Var, cm3 cm3Var) {
        super(NotificationsViewState.e);
        dm9Var.getClass();
        fetchNotificationsUseCase.getClass();
        observerNotificationsFlowUseCase.getClass();
        kd7Var.getClass();
        clearNotificationsUseCase.getClass();
        t72Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        NotificationsViewState.Companion.getClass();
        this.x = dm9Var;
        this.y = fetchNotificationsUseCase;
        this.z = clearNotificationsUseCase;
        this.A = t72Var;
        this.B = bu8Var;
        this.C = cm3Var;
        g(ec6.t, true);
        yk2.o(new k74(observerNotificationsFlowUseCase.b(g2b.a), new NotificationsViewModel$observeNotifications$1(this, null)), rhb.b(this));
        final ji8 ji8Var = kd7Var.a;
        yk2.o(new k74(yk2.j(new r54<dx1>() { // from class: com.hwpo_training_app.notifications.presentation.NotificationsViewModel$observeNotificationsSocketConnectionState$$inlined$filter$1

            /* JADX INFO: renamed from: com.hwpo_training_app.notifications.presentation.NotificationsViewModel$observeNotificationsSocketConnectionState$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass2<T> implements s54 {
                public final /* synthetic */ s54 t;

                /* JADX INFO: renamed from: com.hwpo_training_app.notifications.presentation.NotificationsViewModel$observeNotificationsSocketConnectionState$$inlined$filter$1$2$1, reason: invalid class name */
                @xm2(c = "com.hwpo_training_app.notifications.presentation.NotificationsViewModel$observeNotificationsSocketConnectionState$$inlined$filter$1$2", f = "NotificationsViewModel.kt", l = {217}, m = "emit", v = 2)
                public static final class AnonymousClass1 extends u02 {
                    public /* synthetic */ Object t;
                    public int u;

                    public AnonymousClass1(r02 r02Var) {
                        super(r02Var);
                    }

                    @Override // defpackage.ak0
                    public final Object invokeSuspend(Object obj) {
                        this.t = obj;
                        this.u |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(s54 s54Var) {
                    this.t = s54Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.s54
                public final Object emit(Object obj, r02 r02Var) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (r02Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) r02Var;
                        int i = anonymousClass1.u;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.u = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(r02Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(r02Var);
                    }
                    Object obj2 = anonymousClass1.t;
                    int i2 = anonymousClass1.u;
                    if (i2 == 0) {
                        dv8.b(obj2);
                        if (((dx1) obj) == dx1.v) {
                            anonymousClass1.u = 1;
                            Object objEmit = this.t.emit(obj, anonymousClass1);
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
            public final Object collect(s54<? super dx1> s54Var, r02 r02Var) {
                Object objCollect = ji8Var.collect(new AnonymousClass2(s54Var), r02Var);
                return objCollect == v72.t ? objCollect : g2b.a;
            }
        }, 1), new NotificationsViewModel$observeNotificationsSocketConnectionState$2(this, null)), rhb.b(this));
        this.D = oh7.a(this.u, new v56(1));
        this.E = oh7.a(this.u, new ix3(2));
        this.F = oh7.a(this.u, new jx3(1));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof Action.StartLoading) {
            return NotificationsViewState.a(b(), null, true, false, null, 13);
        }
        if (bl0Var instanceof Action.FinishLoading) {
            return NotificationsViewState.a(b(), null, false, false, null, 9);
        }
        if (bl0Var instanceof Action.StartPaginationLoading) {
            return NotificationsViewState.a(b(), null, false, true, null, 11);
        }
        if (bl0Var instanceof Action.NotificationsListLoaded) {
            return NotificationsViewState.a(b(), ((Action.NotificationsListLoaded) bl0Var).a, false, false, vz7.a(b().d), 6);
        }
        boolean z = bl0Var instanceof Action.ShowErrorPlaceHolder;
        bu8 bu8Var = this.B;
        hf3 hf3Var = hf3.t;
        if (z) {
            return NotificationsViewState.a(b(), hf3Var, false, false, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), 4);
        }
        return bl0Var instanceof Action.ShowNoResultsPlaceHolder ? NotificationsViewState.a(b(), hf3Var, false, false, new vz7(0, true, false, bu8Var.b(R.string.no_notifications_title, new Object[0]), bu8Var.b(R.string.no_notifications_description, new Object[0]), null, 97), 6) : b();
    }

    public final dz9 g(ec6 ec6Var, boolean z) {
        return oy0.d(rhb.b(this), null, null, new NotificationsViewModel$fetchNotifications$1(ec6Var, this, z, null), 3);
    }

    @Override // defpackage.mhb
    public final void onCleared() {
        oy0.d(this.A, null, null, new AnonymousClass1(null), 3);
        super.onCleared();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Action implements bl0 {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class FinishLoading extends Action {
            public static final FinishLoading a = new FinishLoading();

            private FinishLoading() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class NotificationsListLoaded extends Action {
            public final ArrayList a;

            public NotificationsListLoaded(ArrayList arrayList) {
                super(0);
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NotificationsListLoaded) && xj5.a(this.a, ((NotificationsListLoaded) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ml.a("NotificationsListLoaded(items=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ShowErrorPlaceHolder extends Action {
            public static final ShowErrorPlaceHolder a = new ShowErrorPlaceHolder();

            private ShowErrorPlaceHolder() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ShowNoResultsPlaceHolder extends Action {
            public static final ShowNoResultsPlaceHolder a = new ShowNoResultsPlaceHolder();

            private ShowNoResultsPlaceHolder() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class StartLoading extends Action {
            public static final StartLoading a = new StartLoading();

            private StartLoading() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class StartPaginationLoading extends Action {
            static {
                new StartPaginationLoading();
            }

            private StartPaginationLoading() {
                super(0);
            }
        }

        public /* synthetic */ Action(int i) {
            this();
        }

        private Action() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
