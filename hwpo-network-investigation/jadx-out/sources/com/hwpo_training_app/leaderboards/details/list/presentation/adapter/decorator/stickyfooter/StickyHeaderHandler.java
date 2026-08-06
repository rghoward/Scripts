package com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListFragment$initAthletesRecycleView$1$1;
import defpackage.pp2;
import defpackage.rma;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class StickyHeaderHandler {
    public final RecyclerView a;
    public final boolean b;
    public RecyclerView.e0 c;
    public View d;
    public ArrayList f;
    public int g;
    public boolean h;
    public AthletesListFragment$initAthletesRecycleView$1$1 l;
    public final ViewTreeObserver.OnGlobalLayoutListener e = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.StickyHeaderHandler.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            StickyHeaderHandler stickyHeaderHandler = StickyHeaderHandler.this;
            int visibility = stickyHeaderHandler.a.getVisibility();
            View view = stickyHeaderHandler.d;
            if (view != null) {
                view.setVisibility(visibility);
            }
        }
    };
    public int i = -1;
    public float j = -1.0f;
    public int k = -1;

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.StickyHeaderHandler$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    class AnonymousClass5 implements Runnable {
        public final /* synthetic */ int t;

        public AnonymousClass5(int i) {
            this.t = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StickyHeaderHandler stickyHeaderHandler = StickyHeaderHandler.this;
            if (stickyHeaderHandler.h) {
                stickyHeaderHandler.c(this.t);
            }
        }
    }

    public StickyHeaderHandler(RecyclerView recyclerView) {
        this.a = recyclerView;
        this.b = recyclerView.getPaddingLeft() > 0 || recyclerView.getPaddingRight() > 0 || recyclerView.getPaddingTop() > 0;
    }

    public final void a(final LinkedHashMap linkedHashMap) {
        float f;
        View view = this.d;
        if (view == null) {
            return;
        }
        if (view.getHeight() == 0) {
            final View view2 = this.d;
            if (view2 == null) {
                return;
            }
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.StickyHeaderHandler.4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    StickyHeaderHandler stickyHeaderHandler = StickyHeaderHandler.this;
                    if (stickyHeaderHandler.d == null) {
                        return;
                    }
                    ((ViewGroup) stickyHeaderHandler.a.getParent()).requestLayout();
                    stickyHeaderHandler.a(linkedHashMap);
                }
            });
            return;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Integer) entry.getKey()).intValue() > this.i) {
                View view3 = (View) entry.getValue();
                if (this.g != 1 ? view3.getX() < ((float) this.d.getWidth()) : view3.getY() < ((float) this.d.getHeight())) {
                    int i = this.g;
                    View view4 = this.d;
                    if (i == 1) {
                        f = -(view4.getHeight() - view3.getY());
                        this.d.setTranslationY(f);
                    } else {
                        f = -(view4.getWidth() - view3.getX());
                        this.d.setTranslationX(f);
                    }
                } else {
                    f = -1.0f;
                }
                if (f == -1.0f) {
                    break;
                }
                this.d.setVisibility(0);
            }
        }
        int i2 = this.g;
        View view5 = this.d;
        if (i2 == 1) {
            view5.setTranslationY(0.0f);
        } else {
            view5.setTranslationX(0.0f);
        }
        this.d.setVisibility(0);
    }

    public final void b() {
        RecyclerView recyclerView = this.a;
        ViewGroup viewGroup = (ViewGroup) recyclerView.getParent();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) != recyclerView) {
                viewGroup.removeViewAt(childCount);
            }
        }
    }

    public final void c(int i) {
        if (this.d != null) {
            b();
            if (this.l != null) {
                rma.a.a(pp2.a(i, "Header Detached : "), new Object[0]);
            }
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.e);
            this.d = null;
            this.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[LOOP:0: B:18:0x0049->B:107:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r11 = r7.f.indexOf(java.lang.Integer.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r11 <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r8 = ((java.lang.Integer) r7.f.get(r11)).intValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r8, java.util.LinkedHashMap r9, com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.ViewHolderFactory r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.StickyHeaderHandler.d(int, java.util.LinkedHashMap, com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.ViewHolderFactory, boolean):void");
    }
}
