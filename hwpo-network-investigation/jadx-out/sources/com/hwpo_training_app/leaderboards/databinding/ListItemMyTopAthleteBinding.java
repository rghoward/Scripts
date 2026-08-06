package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ListItemMyTopAthleteBinding implements wfb {
    public final ConstraintLayout a;
    public final MaterialTextView b;
    public final MaterialTextView c;
    public final MaterialTextView d;
    public final MaterialTextView e;
    public final ShapeableImageView f;
    public final MaterialTextView g;
    public final MaterialButton h;

    public ListItemMyTopAthleteBinding(ConstraintLayout constraintLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, ShapeableImageView shapeableImageView, MaterialTextView materialTextView5, MaterialButton materialButton) {
        this.a = constraintLayout;
        this.b = materialTextView;
        this.c = materialTextView2;
        this.d = materialTextView3;
        this.e = materialTextView4;
        this.f = shapeableImageView;
        this.g = materialTextView5;
        this.h = materialButton;
    }

    public static ListItemMyTopAthleteBinding bind(View view) {
        int i = R.id.athleteCountryAndYearsText;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.athleteCountryAndYearsText, view);
        if (materialTextView != null) {
            i = R.id.athleteNameFirstLetter;
            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.athleteNameFirstLetter, view);
            if (materialTextView2 != null) {
                i = R.id.athleteNameText;
                MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.athleteNameText, view);
                if (materialTextView3 != null) {
                    i = R.id.athleteResultText;
                    MaterialTextView materialTextView4 = (MaterialTextView) nt3.b(R.id.athleteResultText, view);
                    if (materialTextView4 != null) {
                        i = R.id.avatarContainer;
                        if (((FrameLayout) nt3.b(R.id.avatarContainer, view)) != null) {
                            i = R.id.avatarImg;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nt3.b(R.id.avatarImg, view);
                            if (shapeableImageView != null) {
                                i = R.id.badgeText;
                                MaterialTextView materialTextView5 = (MaterialTextView) nt3.b(R.id.badgeText, view);
                                if (materialTextView5 != null) {
                                    i = R.id.barrier;
                                    if (((Barrier) nt3.b(R.id.barrier, view)) != null) {
                                        i = R.id.bottomSpace;
                                        if (((Space) nt3.b(R.id.bottomSpace, view)) != null) {
                                            i = R.id.openLeaderboardButton;
                                            MaterialButton materialButton = (MaterialButton) nt3.b(R.id.openLeaderboardButton, view);
                                            if (materialButton != null) {
                                                return new ListItemMyTopAthleteBinding((ConstraintLayout) view, materialTextView, materialTextView2, materialTextView3, materialTextView4, shapeableImageView, materialTextView5, materialButton);
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

    public static ListItemMyTopAthleteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_my_top_athlete, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ListItemMyTopAthleteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
