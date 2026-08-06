package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.pp2;
import defpackage.qe8;
import defpackage.u7a;
import defpackage.xd5;
import defpackage.z90;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object v = new Object();
    public final ArrayList t;
    public qe8 u;

    public ProtectionLayout(Context context, List<a> list) {
        super(context);
        this.t = new ArrayList();
        setProtections(list);
    }

    private u7a getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof u7a) {
            return (u7a) tag;
        }
        u7a u7aVar = new u7a(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, u7aVar);
        return u7aVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[LOOP:0: B:7:0x0028->B:27:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba A[SYNTHETIC] */
    public final void a() {
        int i;
        int i2;
        int i3;
        FrameLayout.LayoutParams layoutParams;
        View view;
        b bVar;
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        u7a orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.u = new qe8(orInstallSystemBarStateMonitor, arrayList);
        int childCount = getChildCount();
        int size = this.u.a.size();
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = this.u.a.get(i4);
            Context context = getContext();
            int i5 = i4 + childCount;
            a.C0012a c0012a = aVar.b;
            int i6 = aVar.a;
            int i7 = -1;
            if (i6 != 1) {
                if (i6 == 2) {
                    i3 = c0012a.b;
                    i2 = 48;
                } else if (i6 == 4) {
                    i = c0012a.a;
                    i2 = 5;
                } else if (i6 != 8) {
                    z90.a(pp2.a(i6, "Unexpected side: "));
                    return;
                } else {
                    i3 = c0012a.b;
                    i2 = 80;
                }
                layoutParams = new FrameLayout.LayoutParams(i7, i3, i2);
                xd5 xd5Var = c0012a.c;
                layoutParams.leftMargin = xd5Var.a;
                layoutParams.topMargin = xd5Var.b;
                layoutParams.rightMargin = xd5Var.c;
                layoutParams.bottomMargin = xd5Var.d;
                view = new View(context);
                view.setTag(v);
                view.setTranslationX(c0012a.f);
                view.setTranslationY(c0012a.g);
                view.setAlpha(c0012a.h);
                view.setVisibility(c0012a.d ? 0 : 8);
                view.setBackground(c0012a.e);
                bVar = new b(layoutParams, view);
                if (c0012a.i == null) {
                    aa0.c("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                } else {
                    c0012a.i = bVar;
                    addView(view, i5, layoutParams);
                }
            } else {
                i = c0012a.a;
                i2 = 3;
            }
            i7 = i;
            i3 = -1;
            layoutParams = new FrameLayout.LayoutParams(i7, i3, i2);
            xd5 xd5Var2 = c0012a.c;
            layoutParams.leftMargin = xd5Var2.a;
            layoutParams.topMargin = xd5Var2.b;
            layoutParams.rightMargin = xd5Var2.c;
            layoutParams.bottomMargin = xd5Var2.d;
            view = new View(context);
            view.setTag(v);
            view.setTranslationX(c0012a.f);
            view.setTranslationY(c0012a.g);
            view.setAlpha(c0012a.h);
            view.setVisibility(c0012a.d ? 0 : 8);
            view.setBackground(c0012a.e);
            bVar = new b(layoutParams, view);
            if (c0012a.i == null) {
                aa0.c("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                return;
            } else {
                c0012a.i = bVar;
                addView(view, i5, layoutParams);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != v) {
            qe8 qe8Var = this.u;
            int childCount = getChildCount() - (qe8Var != null ? qe8Var.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        qe8 qe8Var;
        if (this.u != null) {
            removeViews(getChildCount() - this.u.a.size(), this.u.a.size());
            int size = this.u.a.size();
            int i = 0;
            while (true) {
                qe8Var = this.u;
                if (i >= size) {
                    break;
                }
                qe8Var.a.get(i).b.i = null;
                i++;
            }
            ArrayList<a> arrayList = qe8Var.a;
            if (!qe8Var.f) {
                qe8Var.f = true;
                qe8Var.b.b.remove(qe8Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    arrayList.get(size2).e = null;
                }
                arrayList.clear();
            }
            this.u = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof u7a) {
            final u7a u7aVar = (u7a) tag;
            if (u7aVar.b.isEmpty()) {
                u7aVar.a.post(new Runnable() { // from class: t7a
                    @Override // java.lang.Runnable
                    public final void run() {
                        u7a.a aVar = u7aVar.a;
                        ViewParent parent = aVar.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(aVar);
                        }
                    }
                });
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<a> list) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.t = new ArrayList();
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.t = new ArrayList();
    }
}
