package com.hwpo_training_app.leaderboards.attachments.presentation;

import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.valuedetails.domain.GetLeaderboardValueDetailsUseCase;
import defpackage.a46;
import defpackage.af7;
import defpackage.bl0;
import defpackage.bu8;
import defpackage.c91;
import defpackage.cm3;
import defpackage.d91;
import defpackage.dl0;
import defpackage.e91;
import defpackage.el0;
import defpackage.g2b;
import defpackage.k55;
import defpackage.k74;
import defpackage.mz9;
import defpackage.oh7;
import defpackage.oy0;
import defpackage.ph1;
import defpackage.q09;
import defpackage.r31;
import defpackage.rhb;
import defpackage.s60;
import defpackage.sk1;
import defpackage.th1;
import defpackage.u60;
import defpackage.vz7;
import defpackage.w60;
import defpackage.ws0;
import defpackage.xc9;
import defpackage.xj5;
import defpackage.xy3;
import defpackage.yk2;
import defpackage.yq6;
import defpackage.z90;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardValueAttachmentsViewModel extends dl0<LeaderboardValueAttachmentsViewState, Action> {
    public static final /* synthetic */ int J = 0;
    public final GetLeaderboardValueDetailsUseCase A;
    public final k55 B;
    public final xy3 C;
    public final bu8 D;
    public final cm3 E;
    public final int F;
    public final yq6 G;
    public final yq6 H;
    public final yq6 I;
    public final a46 x;
    public final mz9 y;
    public final r31 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[s60.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[u60.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardValueAttachmentsViewModel(a46 a46Var, af7 af7Var, mz9 mz9Var, r31 r31Var, GetLeaderboardValueDetailsUseCase getLeaderboardValueDetailsUseCase, k55 k55Var, xy3 xy3Var, bu8 bu8Var, cm3 cm3Var, q09 q09Var) {
        super(LeaderboardValueAttachmentsViewState.d);
        a46Var.getClass();
        af7Var.getClass();
        mz9Var.getClass();
        r31Var.getClass();
        getLeaderboardValueDetailsUseCase.getClass();
        k55Var.getClass();
        xy3Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        q09Var.getClass();
        LeaderboardValueAttachmentsViewState.Companion.getClass();
        this.x = a46Var;
        this.y = mz9Var;
        this.z = r31Var;
        this.A = getLeaderboardValueDetailsUseCase;
        this.B = k55Var;
        this.C = xy3Var;
        this.D = bu8Var;
        this.E = cm3Var;
        Object objA = q09Var.a("arg_value_id");
        if (objA == null) {
            z90.a("Required value was null.");
            throw null;
        }
        this.F = ((Number) objA).intValue();
        this.G = oh7.a(this.u, new c91(1));
        this.H = oh7.a(this.u, new d91(2));
        this.I = oh7.a(this.u, new e91(1));
        oy0.d(rhb.b(this), null, null, new LeaderboardValueAttachmentsViewModel$loadValueAttachments$1(this, null), 3);
        yk2.o(new k74(af7Var.b(g2b.a), new LeaderboardValueAttachmentsViewModel$observeFileDownloading$1(this, null)), rhb.b(this));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        s60 s60Var;
        ArrayList arrayList;
        bl0Var.getClass();
        if (bl0Var.equals(Action.LoadingStarted.a)) {
            return LeaderboardValueAttachmentsViewState.a(b(), true, null, null, 6);
        }
        if (bl0Var.equals(Action.LoadingFinished.a)) {
            return LeaderboardValueAttachmentsViewState.a(b(), false, vz7.a(b().b), null, 4);
        }
        if (bl0Var.equals(Action.LoadingError.a)) {
            LeaderboardValueAttachmentsViewState leaderboardValueAttachmentsViewStateB = b();
            bu8 bu8Var = this.D;
            return LeaderboardValueAttachmentsViewState.a(leaderboardValueAttachmentsViewStateB, false, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), null, 4);
        }
        if (bl0Var instanceof Action.AttachmentsLoaded) {
            return LeaderboardValueAttachmentsViewState.a(b(), false, null, ((Action.AttachmentsLoaded) bl0Var).a, 3);
        }
        if (!(bl0Var instanceof Action.UpdateFileState)) {
            return b();
        }
        Action.UpdateFileState updateFileState = (Action.UpdateFileState) bl0Var;
        long j = updateFileState.a;
        s60 s60Var2 = updateFileState.b;
        sk1.a aVar = (sk1.a) th1.A(b().c);
        if (aVar == null) {
            return b();
        }
        List<w60> list = aVar.k;
        ArrayList arrayList2 = new ArrayList(ph1.n(list, 10));
        for (w60 aVar2 : list) {
            if (aVar2.b() == j && (aVar2 instanceof w60.a)) {
                w60.a aVar3 = (w60.a) aVar2;
                long j2 = aVar3.b;
                String str = aVar3.c;
                String str2 = aVar3.d;
                String str3 = aVar3.e;
                String str4 = aVar3.f;
                String str5 = aVar3.g;
                long j3 = aVar3.h;
                String str6 = aVar3.i;
                xc9 xc9Var = aVar3.k;
                str.getClass();
                str4.getClass();
                str6.getClass();
                s60Var2.getClass();
                s60Var = s60Var2;
                arrayList = arrayList2;
                aVar2 = new w60.a(j2, str, str2, str3, str4, str5, j3, str6, s60Var, xc9Var);
            } else {
                s60Var = s60Var2;
                arrayList = arrayList2;
            }
            arrayList.add(aVar2);
            arrayList2 = arrayList;
            s60Var2 = s60Var;
        }
        LeaderboardValueAttachmentsViewState leaderboardValueAttachmentsViewStateB2 = b();
        long j4 = aVar.c;
        boolean z = aVar.d;
        boolean z2 = aVar.e;
        String str7 = aVar.f;
        String str8 = aVar.g;
        String str9 = aVar.h;
        String str10 = aVar.i;
        CharSequence charSequence = aVar.j;
        str8.getClass();
        str10.getClass();
        return LeaderboardValueAttachmentsViewState.a(leaderboardValueAttachmentsViewStateB2, false, null, ws0.h(new sk1.a(j4, z, z2, str7, str8, str9, str10, charSequence, arrayList2)), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Action implements bl0 {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class AttachmentsLoaded extends Action {
            public final List<sk1.a> a;

            public AttachmentsLoaded(List<sk1.a> list) {
                super(0);
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AttachmentsLoaded) && xj5.a(this.a, ((AttachmentsLoaded) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "AttachmentsLoaded(attachments=" + this.a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class LoadingError extends Action {
            public static final LoadingError a = new LoadingError();

            private LoadingError() {
                super(0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadingError);
            }

            public final int hashCode() {
                return -1293322902;
            }

            public final String toString() {
                return "LoadingError";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class LoadingFinished extends Action {
            public static final LoadingFinished a = new LoadingFinished();

            private LoadingFinished() {
                super(0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadingFinished);
            }

            public final int hashCode() {
                return -1300641328;
            }

            public final String toString() {
                return "LoadingFinished";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class LoadingStarted extends Action {
            public static final LoadingStarted a = new LoadingStarted();

            private LoadingStarted() {
                super(0);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadingStarted);
            }

            public final int hashCode() {
                return -2055957661;
            }

            public final String toString() {
                return "LoadingStarted";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class UpdateFileState extends Action {
            public final long a;
            public final s60 b;

            public UpdateFileState(long j, s60 s60Var) {
                super(0);
                this.a = j;
                this.b = s60Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateFileState)) {
                    return false;
                }
                UpdateFileState updateFileState = (UpdateFileState) obj;
                return this.a == updateFileState.a && this.b == updateFileState.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "UpdateFileState(id=" + this.a + ", statusAttachment=" + this.b + ")";
            }
        }

        public /* synthetic */ Action(int i) {
            this();
        }

        private Action() {
        }
    }
}
