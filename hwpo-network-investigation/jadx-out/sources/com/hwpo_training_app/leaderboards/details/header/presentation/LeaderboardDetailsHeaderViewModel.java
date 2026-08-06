package com.hwpo_training_app.leaderboards.details.header.presentation;

import android.text.Html;
import android.text.StaticLayout;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType;
import com.hwpo_training_app.leaderboards.details.common.domain.LeaderboardDetailsActionsFlowUseCase;
import com.hwpo_training_app.leaderboards.details.header.domain.ClearCachedTopValuesUseCase;
import com.hwpo_training_app.leaderboards.details.header.domain.ClearLeaderboardDetailsFiltersUseCase;
import com.hwpo_training_app.leaderboards.details.header.domain.GetLeaderboardByIdUseCase;
import com.hwpo_training_app.leaderboards.details.header.domain.SearchTopValuesUseCase;
import com.hwpo_training_app.leaderboards.details.header.presentation.delegate.DescriptionTextHeightDelegate;
import com.hwpo_training_app.leaderboards.details.header.presentation.entity.ExpandableDescriptionStatesUiEntity;
import com.hwpo_training_app.leaderboards.details.header.presentation.entity.HeaderUiEntity;
import com.hwpo_training_app.leaderboards.filter.details.domain.ObserveLeaderboardDetailsFiltersFlowUseCase;
import com.intercom.twig.BuildConfig;
import defpackage.a46;
import defpackage.bl0;
import defpackage.bu8;
import defpackage.ci4;
import defpackage.cm3;
import defpackage.cq2;
import defpackage.df7;
import defpackage.dl0;
import defpackage.dm9;
import defpackage.el0;
import defpackage.g2b;
import defpackage.g36;
import defpackage.h36;
import defpackage.js7;
import defpackage.jw;
import defpackage.k74;
import defpackage.oh7;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.q09;
import defpackage.r02;
import defpackage.rhb;
import defpackage.rma;
import defpackage.t72;
import defpackage.tc;
import defpackage.tc4;
import defpackage.u;
import defpackage.w05;
import defpackage.wa;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yc;
import defpackage.yk2;
import defpackage.yq6;
import defpackage.z2a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsHeaderViewModel extends dl0<LeaderboardDetailsHeaderViewState, Action> {
    public static final /* synthetic */ int R = 0;
    public final GetLeaderboardByIdUseCase A;
    public final ClearCachedTopValuesUseCase B;
    public final SearchTopValuesUseCase C;
    public final ClearLeaderboardDetailsFiltersUseCase D;
    public final DescriptionTextHeightDelegate E;
    public final dm9 F;
    public final bu8 G;
    public final cm3 H;
    public LeaderboardModel I;
    public int J;
    public final yq6 K;
    public final yq6 L;
    public final yq6 M;
    public final yq6 N;
    public final yq6 O;
    public final yq6 P;
    public final yq6 Q;
    public final q09 x;
    public final a46 y;
    public final t72 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ExpandableDescriptionStatesUiEntity.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[LeaderboardType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$onCleared$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$onCleared$1", f = "LeaderboardDetailsHeaderViewModel.kt", l = {378, 378, 379, 379}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$onCleared$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final /* synthetic */ class C00631 extends wa implements ci4<Throwable, r02<? super g2b>, Object> {
            @Override // defpackage.ci4
            public final Object invoke(Throwable th, r02<? super g2b> r02Var) {
                ((rma.a) this.receiver).b(th);
                return g2b.a;
            }
        }

        /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$onCleared$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final /* synthetic */ class AnonymousClass2 extends wa implements ci4<Throwable, r02<? super g2b>, Object> {
            @Override // defpackage.ci4
            public final Object invoke(Throwable th, r02<? super g2b> r02Var) {
                ((rma.a) this.receiver).b(th);
                return g2b.a;
            }
        }

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return LeaderboardDetailsHeaderViewModel.this.new AnonymousClass1(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0068 A[PHI: r15
          0x0068: PHI (r15v8 java.lang.Object) = (r15v7 java.lang.Object), (r15v0 java.lang.Object) binds: [B:21:0x0065, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        
            if (defpackage.yd3.a((defpackage.xd3) r15, r7, r14) == r6) goto L25;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                r14 = this;
                int r0 = r14.t
                com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel r1 = com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel.this
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                v72 r6 = defpackage.v72.t
                if (r0 == 0) goto L2b
                if (r0 == r5) goto L27
                if (r0 == r4) goto L23
                if (r0 == r3) goto L1f
                if (r0 != r2) goto L18
                defpackage.dv8.b(r15)
                goto L82
            L18:
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r14)
                r14 = 0
                return r14
            L1f:
                defpackage.dv8.b(r15)
                goto L68
            L23:
                defpackage.dv8.b(r15)
                goto L58
            L27:
                defpackage.dv8.b(r15)
                goto L3e
            L2b:
                defpackage.dv8.b(r15)
                com.hwpo_training_app.leaderboards.details.header.domain.ClearCachedTopValuesUseCase r15 = r1.B
                g2b r0 = defpackage.g2b.a
                r14.t = r5
                r15.getClass()
                java.lang.Object r15 = defpackage.g5b.b(r15, r0, r14)
                if (r15 != r6) goto L3e
                goto L81
            L3e:
                xd3 r15 = (defpackage.xd3) r15
                com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$onCleared$1$1 r7 = new com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$onCleared$1$1
                rma$a r9 = defpackage.rma.a
                java.lang.String r12 = "e(Ljava/lang/Throwable;)V"
                r13 = 4
                r8 = 2
                java.lang.Class<rma$a> r10 = rma.a.class
                java.lang.String r11 = "e"
                r7.<init>(r8, r9, r10, r11, r12, r13)
                r14.t = r4
                java.lang.Object r15 = defpackage.yd3.a(r15, r7, r14)
                if (r15 != r6) goto L58
                goto L81
            L58:
                com.hwpo_training_app.leaderboards.details.header.domain.ClearLeaderboardDetailsFiltersUseCase r15 = r1.D
                g2b r0 = defpackage.g2b.a
                r14.t = r3
                r15.getClass()
                java.lang.Object r15 = defpackage.g5b.b(r15, r0, r14)
                if (r15 != r6) goto L68
                goto L81
            L68:
                xd3 r15 = (defpackage.xd3) r15
                com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$onCleared$1$2 r7 = new com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$onCleared$1$2
                rma$a r9 = defpackage.rma.a
                java.lang.String r12 = "e(Ljava/lang/Throwable;)V"
                r13 = 4
                r8 = 2
                java.lang.Class<rma$a> r10 = rma.a.class
                java.lang.String r11 = "e"
                r7.<init>(r8, r9, r10, r11, r12, r13)
                r14.t = r2
                java.lang.Object r14 = defpackage.yd3.a(r15, r7, r14)
                if (r14 != r6) goto L82
            L81:
                return r6
            L82:
                g2b r14 = defpackage.g2b.a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsHeaderViewModel(q09 q09Var, a46 a46Var, t72 t72Var, LeaderboardDetailsActionsFlowUseCase leaderboardDetailsActionsFlowUseCase, ObserveLeaderboardDetailsFiltersFlowUseCase observeLeaderboardDetailsFiltersFlowUseCase, GetLeaderboardByIdUseCase getLeaderboardByIdUseCase, ClearCachedTopValuesUseCase clearCachedTopValuesUseCase, SearchTopValuesUseCase searchTopValuesUseCase, df7 df7Var, ClearLeaderboardDetailsFiltersUseCase clearLeaderboardDetailsFiltersUseCase, DescriptionTextHeightDelegate descriptionTextHeightDelegate, dm9 dm9Var, bu8 bu8Var, cm3 cm3Var) {
        super(LeaderboardDetailsHeaderViewState.h);
        q09Var.getClass();
        a46Var.getClass();
        t72Var.getClass();
        leaderboardDetailsActionsFlowUseCase.getClass();
        observeLeaderboardDetailsFiltersFlowUseCase.getClass();
        getLeaderboardByIdUseCase.getClass();
        clearCachedTopValuesUseCase.getClass();
        searchTopValuesUseCase.getClass();
        df7Var.getClass();
        clearLeaderboardDetailsFiltersUseCase.getClass();
        descriptionTextHeightDelegate.getClass();
        dm9Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        LeaderboardDetailsHeaderViewState.Companion.getClass();
        this.x = q09Var;
        this.y = a46Var;
        this.z = t72Var;
        this.A = getLeaderboardByIdUseCase;
        this.B = clearCachedTopValuesUseCase;
        this.C = searchTopValuesUseCase;
        this.D = clearLeaderboardDetailsFiltersUseCase;
        this.E = descriptionTextHeightDelegate;
        this.F = dm9Var;
        this.G = bu8Var;
        this.H = cm3Var;
        String str = (String) q09Var.a("leaderboard_title");
        String str2 = BuildConfig.FLAVOR;
        String str3 = str == null ? BuildConfig.FLAVOR : str;
        String str4 = (String) q09Var.a("leaderboard_description");
        String str5 = str4 == null ? BuildConfig.FLAVOR : str4;
        String str6 = (String) q09Var.a("leaderboard_updated_at_desc");
        String str7 = str6 == null ? BuildConfig.FLAVOR : str6;
        boolean zO = z2a.o(str5, "<body>", false);
        CharSequence charSequenceFromHtml = str5;
        if (zO) {
            String strC = rhb.c(str5);
            charSequenceFromHtml = Html.fromHtml(strC != null ? strC : str2, 63);
        }
        CharSequence charSequence = charSequenceFromHtml;
        int i = 1;
        e(new Action.HeaderLoaded(new HeaderUiEntity(str3, str7, charSequence, !(charSequence == null || charSequence.length() == 0), false, false)));
        g2b g2bVar = g2b.a;
        yk2.o(new k74(df7Var.b(g2bVar), new LeaderboardDetailsHeaderViewModel$observePerformanceUpdates$1(this, null)), rhb.b(this));
        yk2.o(new k74(leaderboardDetailsActionsFlowUseCase.b(g2bVar), new LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsActions$1(this, null)), rhb.b(this));
        yk2.o(new k74(observeLeaderboardDetailsFiltersFlowUseCase.b(g2bVar), new LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsFiltersState$1(this, null)), rhb.b(this));
        e(Action.StartLoading.a);
        oy0.d(rhb.b(this), null, null, new LeaderboardDetailsHeaderViewModel$loadLeaderboardDetails$1(this, null), 3);
        this.K = oh7.a(this.u, new g36());
        this.L = oh7.a(this.u, new jw(1));
        this.M = oh7.a(this.u, new h36());
        this.N = oh7.a(this.u, new tc(i));
        this.O = oh7.a(this.u, new w05(1));
        this.P = oh7.a(this.u, new tc4(1));
        this.Q = oh7.a(this.u, new yc(3));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof Action.StartLoading) {
            return LeaderboardDetailsHeaderViewState.a(b(), null, true, null, null, false, false, false, 125);
        }
        if (bl0Var instanceof Action.FinishLoading) {
            return LeaderboardDetailsHeaderViewState.a(b(), null, false, null, null, false, false, false, 125);
        }
        if (bl0Var instanceof Action.HeaderLoaded) {
            return LeaderboardDetailsHeaderViewState.a(b(), ((Action.HeaderLoaded) bl0Var).a, false, null, null, false, false, false, 124);
        }
        if (bl0Var instanceof Action.ChangeExpandableDescriptionState) {
            Action.ChangeExpandableDescriptionState changeExpandableDescriptionState = (Action.ChangeExpandableDescriptionState) bl0Var;
            return LeaderboardDetailsHeaderViewState.a(b(), null, false, changeExpandableDescriptionState.a, changeExpandableDescriptionState.b, false, false, false, 115);
        }
        if (bl0Var instanceof Action.FiltersChanged) {
            return LeaderboardDetailsHeaderViewState.a(b(), null, false, null, null, ((Action.FiltersChanged) bl0Var).a, false, false, 111);
        }
        if (!(bl0Var instanceof Action.ChangeSearchToolbarState)) {
            return b();
        }
        Action.ChangeSearchToolbarState changeSearchToolbarState = (Action.ChangeSearchToolbarState) bl0Var;
        return LeaderboardDetailsHeaderViewState.a(b(), null, false, null, null, false, changeSearchToolbarState.a, changeSearchToolbarState.b, 31);
    }

    public final void g() {
        ExpandableDescriptionStatesUiEntity expandableDescriptionStatesUiEntity;
        CharSequence charSequence = b().a.c;
        if (charSequence == null || charSequence.length() <= 0) {
            charSequence = null;
        }
        bu8 bu8Var = this.G;
        if (charSequence != null) {
            int i = this.J;
            DescriptionTextHeightDelegate descriptionTextHeightDelegate = this.E;
            descriptionTextHeightDelegate.getClass();
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), descriptionTextHeightDelegate.b, i).build();
            staticLayoutBuild.getClass();
            expandableDescriptionStatesUiEntity = ((float) staticLayoutBuild.getHeight()) > bu8Var.d(R.dimen.leaderboard_description_collapsed_height) ? ExpandableDescriptionStatesUiEntity.w : ExpandableDescriptionStatesUiEntity.v;
        } else {
            expandableDescriptionStatesUiEntity = ExpandableDescriptionStatesUiEntity.t;
        }
        e(new Action.ChangeExpandableDescriptionState(expandableDescriptionStatesUiEntity, bu8Var.b(R.string.show_more, new Object[0])));
    }

    public final int i() {
        Integer num = (Integer) this.x.a("leaderboard_id");
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        js7 js7Var;
        int iOrdinal = b().c.ordinal();
        if (iOrdinal == 1) {
            js7Var = new js7(ExpandableDescriptionStatesUiEntity.x, Integer.valueOf(R.string.show_more));
        } else {
            if (iOrdinal == 2) {
                return;
            }
            if (iOrdinal == 3 || iOrdinal == 4) {
                js7Var = new js7(ExpandableDescriptionStatesUiEntity.u, Integer.valueOf(R.string.show_less));
            } else {
                js7Var = new js7(ExpandableDescriptionStatesUiEntity.t, 0);
            }
        }
        e(new Action.ChangeExpandableDescriptionState((ExpandableDescriptionStatesUiEntity) js7Var.t, this.G.b(((Number) js7Var.u).intValue(), new Object[0])));
    }

    public final void k() {
        q09 q09Var = this.x;
        Boolean bool = (Boolean) q09Var.a("allow_navigate_to_tracking");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        a46 a46Var = this.y;
        if (!zBooleanValue) {
            if (zBooleanValue) {
                u.b();
                return;
            } else {
                a46Var.a();
                return;
            }
        }
        LeaderboardModel leaderboardModel = this.I;
        if (leaderboardModel == null) {
            return;
        }
        int i = i();
        String str = (String) q09Var.a("leaderboard_title");
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        a46Var.j(i, leaderboardModel.e, leaderboardModel.n, str);
    }

    @Override // defpackage.mhb
    public final void onCleared() {
        super.onCleared();
        oy0.d(this.z, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Action implements bl0 {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ChangeExpandableDescriptionState extends Action {
            public final ExpandableDescriptionStatesUiEntity a;
            public final String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChangeExpandableDescriptionState(ExpandableDescriptionStatesUiEntity expandableDescriptionStatesUiEntity, String str) {
                super(0);
                expandableDescriptionStatesUiEntity.getClass();
                str.getClass();
                this.a = expandableDescriptionStatesUiEntity;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChangeExpandableDescriptionState)) {
                    return false;
                }
                ChangeExpandableDescriptionState changeExpandableDescriptionState = (ChangeExpandableDescriptionState) obj;
                return this.a == changeExpandableDescriptionState.a && xj5.a(this.b, changeExpandableDescriptionState.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "ChangeExpandableDescriptionState(expandableDescriptionState=" + this.a + ", expandButtonText=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ChangeSearchToolbarState extends Action {
            public final boolean a;
            public final boolean b;

            public ChangeSearchToolbarState(boolean z, boolean z2) {
                super(0);
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChangeSearchToolbarState)) {
                    return false;
                }
                ChangeSearchToolbarState changeSearchToolbarState = (ChangeSearchToolbarState) obj;
                return this.a == changeSearchToolbarState.a && this.b == changeSearchToolbarState.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "ChangeSearchToolbarState(isToolbarVisible=" + this.a + ", isCancelSearchButtonVisible=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class FiltersChanged extends Action {
            public final boolean a;

            public FiltersChanged(boolean z) {
                super(0);
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FiltersChanged) && this.a == ((FiltersChanged) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return cq2.a("FiltersChanged(isBadgeVisible=", ")", this.a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class FinishLoading extends Action {
            public static final FinishLoading a = new FinishLoading();

            private FinishLoading() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class HeaderLoaded extends Action {
            public final HeaderUiEntity a;

            public HeaderLoaded(HeaderUiEntity headerUiEntity) {
                super(0);
                this.a = headerUiEntity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HeaderLoaded) && xj5.a(this.a, ((HeaderLoaded) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "HeaderLoaded(headerState=" + this.a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class StartLoading extends Action {
            public static final StartLoading a = new StartLoading();

            private StartLoading() {
                super(0);
            }
        }

        public /* synthetic */ Action(int i) {
            this();
        }

        private Action() {
        }
    }
}
