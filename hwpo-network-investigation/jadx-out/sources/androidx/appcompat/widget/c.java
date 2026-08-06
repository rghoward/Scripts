package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import com.hwpo_training_app.R;
import defpackage.e00;
import defpackage.egb;
import defpackage.fib;
import defpackage.gpa;
import defpackage.nq2;
import defpackage.oqa;
import defpackage.ph8;
import defpackage.rn2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements rn2 {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public final Drawable f;
    public final boolean g;
    public CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public Window.Callback k;
    public boolean l;
    public androidx.appcompat.widget.a m;
    public final int n;
    public final Drawable o;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends nq2 {
        public boolean a = false;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // defpackage.nq2, defpackage.hib
        public final void a() {
            c.this.a.setVisibility(0);
        }

        @Override // defpackage.hib
        public final void b() {
            if (this.a) {
                return;
            }
            c.this.a.setVisibility(this.b);
        }

        @Override // defpackage.nq2, defpackage.hib
        public final void c() {
            this.a = true;
        }
    }

    public c(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        gpa gpaVarE = gpa.e(toolbar.getContext(), null, ph8.a, R.attr.actionBarStyle);
        TypedArray typedArray = gpaVarE.b;
        int i = 15;
        this.o = gpaVarE.b(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.h = text;
                if ((this.b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.g) {
                        egb.p(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableB = gpaVarE.b(20);
            if (drawableB != null) {
                this.e = drawableB;
                t();
            }
            Drawable drawableB2 = gpaVarE.b(17);
            if (drawableB2 != null) {
                setIcon(drawableB2);
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                if ((this.b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            j(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                j(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.b = i;
        }
        gpaVarE.f();
        if (R.string.abc_action_bar_up_description != this.n) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.n;
                this.j = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                s();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new oqa(this));
    }

    @Override // defpackage.rn2
    public final void a(Menu menu, j.a aVar) {
        androidx.appcompat.widget.a aVar2 = this.m;
        Toolbar toolbar = this.a;
        if (aVar2 == null) {
            androidx.appcompat.widget.a aVar3 = new androidx.appcompat.widget.a(toolbar.getContext());
            this.m = aVar3;
            aVar3.B = R.id.action_menu_presenter;
        }
        androidx.appcompat.widget.a aVar4 = this.m;
        aVar4.x = aVar;
        toolbar.setMenu((f) menu, aVar4);
    }

    @Override // defpackage.rn2
    public final boolean b() {
        return this.a.isOverflowMenuShowing();
    }

    @Override // defpackage.rn2
    public final void c() {
        this.l = true;
    }

    @Override // defpackage.rn2
    public final void collapseActionView() {
        this.a.collapseActionView();
    }

    @Override // defpackage.rn2
    public final boolean d() {
        return this.a.canShowOverflowMenu();
    }

    @Override // defpackage.rn2
    public final boolean e() {
        return this.a.isOverflowMenuShowPending();
    }

    @Override // defpackage.rn2
    public final boolean f() {
        return this.a.hideOverflowMenu();
    }

    @Override // defpackage.rn2
    public final boolean g() {
        return this.a.showOverflowMenu();
    }

    @Override // defpackage.rn2
    public final Context getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.rn2
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // defpackage.rn2
    public final void h() {
        this.a.dismissPopupMenus();
    }

    @Override // defpackage.rn2
    public final boolean i() {
        return this.a.hasExpandedActionView();
    }

    @Override // defpackage.rn2
    public final void j(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.a;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    s();
                }
                if ((this.b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                t();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    @Override // defpackage.rn2
    public final void l(int i) {
        this.e = i != 0 ? e00.b(this.a.getContext(), i) : null;
        t();
    }

    @Override // defpackage.rn2
    public final fib m(int i, long j) {
        fib fibVarB = egb.b(this.a);
        fibVarB.a(i == 0 ? 1.0f : 0.0f);
        fibVarB.c(j);
        fibVarB.d(new a(i));
        return fibVarB;
    }

    @Override // defpackage.rn2
    public final void n(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.rn2
    public final int o() {
        return this.b;
    }

    @Override // defpackage.rn2
    public final void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.rn2
    public final void q() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.rn2
    public final void r(boolean z) {
        this.a.setCollapsible(z);
    }

    public final void s() {
        if ((this.b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    @Override // defpackage.rn2
    public final void setIcon(int i) {
        setIcon(i != 0 ? e00.b(this.a.getContext(), i) : null);
    }

    @Override // defpackage.rn2
    public final void setWindowCallback(Window.Callback callback) {
        this.k = callback;
    }

    @Override // defpackage.rn2
    public final void setWindowTitle(CharSequence charSequence) {
        boolean z = this.g;
        if (z) {
            return;
        }
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.setTitle(charSequence);
            if (z) {
                egb.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void t() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }

    @Override // defpackage.rn2
    public final void setIcon(Drawable drawable) {
        this.d = drawable;
        t();
    }

    @Override // defpackage.rn2
    public final void k() {
    }
}
