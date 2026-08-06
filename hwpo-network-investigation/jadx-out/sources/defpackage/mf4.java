package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mf4 implements wfb {
    public final RelativeLayout a;
    public final ShapeableImageView b;
    public final MaterialTextView c;
    public final MaterialTextView d;
    public final MaterialTextView e;
    public final MaterialTextView f;
    public final MaterialTextView g;
    public final MaterialTextView h;
    public final MaterialTextView i;
    public final SwipeRefreshLayout j;
    public final SimpleProgressBar k;
    public final MaterialTextView l;
    public final MaterialTextView m;

    public mf4(RelativeLayout relativeLayout, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, SwipeRefreshLayout swipeRefreshLayout, SimpleProgressBar simpleProgressBar, MaterialTextView materialTextView8, MaterialTextView materialTextView9) {
        this.a = relativeLayout;
        this.b = shapeableImageView;
        this.c = materialTextView;
        this.d = materialTextView2;
        this.e = materialTextView3;
        this.f = materialTextView4;
        this.g = materialTextView5;
        this.h = materialTextView6;
        this.i = materialTextView7;
        this.j = swipeRefreshLayout;
        this.k = simpleProgressBar;
        this.l = materialTextView8;
        this.m = materialTextView9;
    }

    public static mf4 bind(View view) {
        int i = R.id.avatarContainer;
        if (((FrameLayout) nt3.b(R.id.avatarContainer, view)) != null) {
            i = R.id.avatarImg;
            ShapeableImageView shapeableImageView = (ShapeableImageView) nt3.b(R.id.avatarImg, view);
            if (shapeableImageView != null) {
                i = R.id.btn_account;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.btn_account, view);
                if (materialTextView != null) {
                    i = R.id.btn_tracking;
                    MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.btn_tracking, view);
                    if (materialTextView2 != null) {
                        i = R.id.emailText;
                        MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.emailText, view);
                        if (materialTextView3 != null) {
                            i = R.id.fullNameText;
                            MaterialTextView materialTextView4 = (MaterialTextView) nt3.b(R.id.fullNameText, view);
                            if (materialTextView4 != null) {
                                i = R.id.helpCentre;
                                MaterialTextView materialTextView5 = (MaterialTextView) nt3.b(R.id.helpCentre, view);
                                if (materialTextView5 != null) {
                                    i = R.id.logoutBtn;
                                    MaterialTextView materialTextView6 = (MaterialTextView) nt3.b(R.id.logoutBtn, view);
                                    if (materialTextView6 != null) {
                                        i = R.id.privacyPolicy;
                                        MaterialTextView materialTextView7 = (MaterialTextView) nt3.b(R.id.privacyPolicy, view);
                                        if (materialTextView7 != null) {
                                            i = R.id.profileHeader;
                                            if (((LinearLayoutCompat) nt3.b(R.id.profileHeader, view)) != null) {
                                                i = R.id.profileSwipeToRefresh;
                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nt3.b(R.id.profileSwipeToRefresh, view);
                                                if (swipeRefreshLayout != null) {
                                                    i = R.id.progress;
                                                    SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                                    if (simpleProgressBar != null) {
                                                        i = R.id.termsOfService;
                                                        MaterialTextView materialTextView8 = (MaterialTextView) nt3.b(R.id.termsOfService, view);
                                                        if (materialTextView8 != null) {
                                                            i = R.id.toolbar;
                                                            if (((MaterialToolbar) nt3.b(R.id.toolbar, view)) != null) {
                                                                i = R.id.user_name_first_letter;
                                                                MaterialTextView materialTextView9 = (MaterialTextView) nt3.b(R.id.user_name_first_letter, view);
                                                                if (materialTextView9 != null) {
                                                                    return new mf4((RelativeLayout) view, shapeableImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7, swipeRefreshLayout, simpleProgressBar, materialTextView8, materialTextView9);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static mf4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static mf4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
