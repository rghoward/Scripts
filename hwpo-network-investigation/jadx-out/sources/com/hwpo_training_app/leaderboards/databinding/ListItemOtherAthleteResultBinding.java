package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ListItemOtherAthleteResultBinding implements wfb {
    public final ConstraintLayout a;
    public final MaterialTextView b;
    public final MaterialTextView c;
    public final MaterialTextView d;
    public final MaterialTextView e;
    public final MaterialTextView f;
    public final ShapeableImageView g;
    public final MaterialTextView h;
    public final MaterialTextView i;
    public final View j;
    public final MaterialTextView k;
    public final ImageView l;

    public ListItemOtherAthleteResultBinding(ConstraintLayout constraintLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, ShapeableImageView shapeableImageView, MaterialTextView materialTextView6, MaterialTextView materialTextView7, View view, MaterialTextView materialTextView8, ImageView imageView) {
        this.a = constraintLayout;
        this.b = materialTextView;
        this.c = materialTextView2;
        this.d = materialTextView3;
        this.e = materialTextView4;
        this.f = materialTextView5;
        this.g = shapeableImageView;
        this.h = materialTextView6;
        this.i = materialTextView7;
        this.j = view;
        this.k = materialTextView8;
        this.l = imageView;
    }

    public static ListItemOtherAthleteResultBinding bind(View view) {
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
                        i = R.id.attachmentsCountText;
                        MaterialTextView materialTextView5 = (MaterialTextView) nt3.b(R.id.attachmentsCountText, view);
                        if (materialTextView5 != null) {
                            i = R.id.avatarContainer;
                            if (((FrameLayout) nt3.b(R.id.avatarContainer, view)) != null) {
                                i = R.id.avatarImg;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) nt3.b(R.id.avatarImg, view);
                                if (shapeableImageView != null) {
                                    i = R.id.badgeText;
                                    MaterialTextView materialTextView6 = (MaterialTextView) nt3.b(R.id.badgeText, view);
                                    if (materialTextView6 != null) {
                                        i = R.id.barrierBottomSpace;
                                        if (((Barrier) nt3.b(R.id.barrierBottomSpace, view)) != null) {
                                            i = R.id.bottomSpace;
                                            if (((Space) nt3.b(R.id.bottomSpace, view)) != null) {
                                                i = R.id.commentsCountText;
                                                MaterialTextView materialTextView7 = (MaterialTextView) nt3.b(R.id.commentsCountText, view);
                                                if (materialTextView7 != null) {
                                                    i = R.id.fadeout;
                                                    View viewB = nt3.b(R.id.fadeout, view);
                                                    if (viewB != null) {
                                                        i = R.id.likesCountText;
                                                        MaterialTextView materialTextView8 = (MaterialTextView) nt3.b(R.id.likesCountText, view);
                                                        if (materialTextView8 != null) {
                                                            i = R.id.showHideBtn;
                                                            ImageView imageView = (ImageView) nt3.b(R.id.showHideBtn, view);
                                                            if (imageView != null) {
                                                                return new ListItemOtherAthleteResultBinding((ConstraintLayout) view, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, shapeableImageView, materialTextView6, materialTextView7, viewB, materialTextView8, imageView);
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

    public static ListItemOtherAthleteResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_other_athlete_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ListItemOtherAthleteResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
