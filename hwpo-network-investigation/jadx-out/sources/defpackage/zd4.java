package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.PickedOptionTextView;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zd4 implements wfb {
    public final RelativeLayout a;
    public final ShapeableImageView b;
    public final PickedOptionTextView c;
    public final MaterialTextView d;
    public final MaterialTextView e;
    public final AppCompatImageView f;
    public final MaterialTextView g;
    public final MaterialTextView h;
    public final PickedOptionTextView i;
    public final MaterialTextView j;
    public final PickedOptionTextView k;
    public final PickedOptionTextView l;
    public final PickedOptionTextView m;
    public final SimpleProgressBar n;
    public final MaterialToolbar o;
    public final MaterialTextView p;

    public zd4(RelativeLayout relativeLayout, ShapeableImageView shapeableImageView, PickedOptionTextView pickedOptionTextView, MaterialTextView materialTextView, MaterialTextView materialTextView2, AppCompatImageView appCompatImageView, MaterialTextView materialTextView3, MaterialTextView materialTextView4, PickedOptionTextView pickedOptionTextView2, MaterialTextView materialTextView5, PickedOptionTextView pickedOptionTextView3, PickedOptionTextView pickedOptionTextView4, PickedOptionTextView pickedOptionTextView5, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar, MaterialTextView materialTextView6) {
        this.a = relativeLayout;
        this.b = shapeableImageView;
        this.c = pickedOptionTextView;
        this.d = materialTextView;
        this.e = materialTextView2;
        this.f = appCompatImageView;
        this.g = materialTextView3;
        this.h = materialTextView4;
        this.i = pickedOptionTextView2;
        this.j = materialTextView5;
        this.k = pickedOptionTextView3;
        this.l = pickedOptionTextView4;
        this.m = pickedOptionTextView5;
        this.n = simpleProgressBar;
        this.o = materialToolbar;
        this.p = materialTextView6;
    }

    public static zd4 bind(View view) {
        int i = R.id.avatarContainer;
        if (((FrameLayout) nt3.b(R.id.avatarContainer, view)) != null) {
            i = R.id.avatarImg;
            ShapeableImageView shapeableImageView = (ShapeableImageView) nt3.b(R.id.avatarImg, view);
            if (shapeableImageView != null) {
                i = R.id.birthday_option_text;
                PickedOptionTextView pickedOptionTextView = (PickedOptionTextView) nt3.b(R.id.birthday_option_text, view);
                if (pickedOptionTextView != null) {
                    i = R.id.btn_change_password;
                    MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.btn_change_password, view);
                    if (materialTextView != null) {
                        i = R.id.btn_delete_account;
                        MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.btn_delete_account, view);
                        if (materialTextView2 != null) {
                            i = R.id.btn_delete_photo;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.btn_delete_photo, view);
                            if (appCompatImageView != null) {
                                i = R.id.btn_settings;
                                MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.btn_settings, view);
                                if (materialTextView3 != null) {
                                    i = R.id.btn_upload_new_photo;
                                    MaterialTextView materialTextView4 = (MaterialTextView) nt3.b(R.id.btn_upload_new_photo, view);
                                    if (materialTextView4 != null) {
                                        i = R.id.country_option_text;
                                        PickedOptionTextView pickedOptionTextView2 = (PickedOptionTextView) nt3.b(R.id.country_option_text, view);
                                        if (pickedOptionTextView2 != null) {
                                            i = R.id.emailText;
                                            MaterialTextView materialTextView5 = (MaterialTextView) nt3.b(R.id.emailText, view);
                                            if (materialTextView5 != null) {
                                                i = R.id.first_name_option_text;
                                                PickedOptionTextView pickedOptionTextView3 = (PickedOptionTextView) nt3.b(R.id.first_name_option_text, view);
                                                if (pickedOptionTextView3 != null) {
                                                    i = R.id.gym_option_text;
                                                    PickedOptionTextView pickedOptionTextView4 = (PickedOptionTextView) nt3.b(R.id.gym_option_text, view);
                                                    if (pickedOptionTextView4 != null) {
                                                        i = R.id.last_name_option_text;
                                                        PickedOptionTextView pickedOptionTextView5 = (PickedOptionTextView) nt3.b(R.id.last_name_option_text, view);
                                                        if (pickedOptionTextView5 != null) {
                                                            i = R.id.profileHeader;
                                                            if (((ConstraintLayout) nt3.b(R.id.profileHeader, view)) != null) {
                                                                i = R.id.progress;
                                                                SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                                                if (simpleProgressBar != null) {
                                                                    i = R.id.toolbar;
                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                                    if (materialToolbar != null) {
                                                                        i = R.id.user_name_first_letter;
                                                                        MaterialTextView materialTextView6 = (MaterialTextView) nt3.b(R.id.user_name_first_letter, view);
                                                                        if (materialTextView6 != null) {
                                                                            return new zd4((RelativeLayout) view, shapeableImageView, pickedOptionTextView, materialTextView, materialTextView2, appCompatImageView, materialTextView3, materialTextView4, pickedOptionTextView2, materialTextView5, pickedOptionTextView3, pickedOptionTextView4, pickedOptionTextView5, simpleProgressBar, materialToolbar, materialTextView6);
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
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static zd4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static zd4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
