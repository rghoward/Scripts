package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.aa0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final TabLayout a;
    public final ViewPager2 b;
    public final b c;
    public RecyclerView.f<?> d;
    public boolean e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends RecyclerView.h {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void a() {
            c.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void b() {
            c.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void c(int i, int i2) {
            c.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void d(int i, int i2) {
            c.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void e(int i, int i2) {
            c.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void f(int i, int i2) {
            c.this.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void a(TabLayout.g gVar, int i);
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class C0057c extends ViewPager2.g {
        public final WeakReference<TabLayout> a;
        public int c = 0;
        public int b = 0;

        public C0057c(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void a(int i) {
            this.b = this.c;
            this.c = i;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                tabLayout.r0 = this.c;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void b(int i, float f, int i2) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                boolean z = true;
                if (i3 == 2 && this.b != 1) {
                    z = false;
                }
                if (i3 == 2 && this.b == 0) {
                    z = false;
                }
                tabLayout.n(i, f, z, z, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.c;
            tabLayout.l(tabLayout.h(i), i2 == 0 || (i2 == 2 && this.b == 0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d implements TabLayout.d {
        public final ViewPager2 a;

        public d(ViewPager2 viewPager2) {
            this.a = viewPager2;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            this.a.c(gVar.d, true);
        }
    }

    public c(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this.a = tabLayout;
        this.b = viewPager2;
        this.c = bVar;
    }

    public final void a() {
        if (this.e) {
            aa0.c("TabLayoutMediator is already attached");
            return;
        }
        ViewPager2 viewPager2 = this.b;
        RecyclerView.f<?> adapter = viewPager2.getAdapter();
        this.d = adapter;
        if (adapter == null) {
            aa0.c("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.e = true;
        TabLayout tabLayout = this.a;
        viewPager2.v.a.add(new C0057c(tabLayout));
        tabLayout.a(new d(viewPager2));
        this.d.r(new a());
        b();
        tabLayout.n(viewPager2.getCurrentItem(), 0.0f, true, true, true);
    }

    public final void b() {
        TabLayout tabLayout = this.a;
        tabLayout.k();
        RecyclerView.f<?> fVar = this.d;
        if (fVar != null) {
            int iF = fVar.f();
            for (int i = 0; i < iF; i++) {
                TabLayout.g gVarI = tabLayout.i();
                this.c.a(gVarI, i);
                tabLayout.b(gVarI, false);
            }
            if (iF > 0) {
                int iMin = Math.min(this.b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.l(tabLayout.h(iMin), true);
                }
            }
        }
    }
}
