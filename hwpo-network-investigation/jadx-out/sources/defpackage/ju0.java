package defpackage;

import com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerFragment;
import com.hwpo_training_app.notifications.presentation.NotificationsFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ju0 implements hu0 {
    public final a a = new a();
    public final b b = new b();
    public final c c = new c();
    public final d d = new d();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ln4 {
        public final String x;

        public a() {
            super(23);
            this.x = jpb.class.getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends ln4 {
        public final String x;

        public b() {
            super(23);
            this.x = LeaderboardTabContainerFragment.class.getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends ln4 {
        public final String x;

        public c() {
            super(23);
            this.x = NotificationsFragment.class.getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends ln4 {
        public final String x;

        public d() {
            super(23);
            this.x = db8.class.getName();
        }
    }

    @Override // defpackage.hu0
    public final c a() {
        return this.c;
    }

    @Override // defpackage.hu0
    public final a b() {
        return this.a;
    }

    @Override // defpackage.hu0
    public final b c() {
        return this.b;
    }

    @Override // defpackage.hu0
    public final d d() {
        return this.d;
    }

    @Override // defpackage.hu0
    public final ku0 e(String str) {
        str.getClass();
        return new ku0(str);
    }
}
