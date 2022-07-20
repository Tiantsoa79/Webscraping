package com.my.newproject;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Context;
import android.os.Vibrator;
import android.content.Intent;
import android.content.ClipData;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.SoundPool;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;
import android.Manifest;
import android.content.pm.PackageManager;


public class MainActivity extends Activity {
	public final int REQ_CD_FILE = 101;
	
	private TextView textview1;
	private Button button1;
	private ImageView imageview1;
	private TextView textview2;
	private TextView textview4;
	private TextView textview3;
	
	private Vibrator vibrqte;
	private Intent file = new Intent(Intent.ACTION_GET_CONTENT);
	private AlertDialog.Builder dialog;
	private SoundPool sound;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		if (Build.VERSION.SDK_INT >= 23) {
			if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
				requestPermissions(new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
			}
			else {
				initializeLogic();
			}
		}
		else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		textview1 = (TextView) findViewById(R.id.textview1);
		button1 = (Button) findViewById(R.id.button1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview3 = (TextView) findViewById(R.id.textview3);
		vibrqte = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		file.setType("text/*");
		file.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		dialog = new AlertDialog.Builder(this);
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dialog.setTitle("Scrapped from 'Portal Job'");
				dialog.setMessage("LISTE DES OFFRES D'EMPLOI\n \nURGENT\nRESPONSABLE RECHERCHE DÉVELOPPEMENT - SAMBAVA\nSYMRISE\nContrat Avec essai\nLa société est en plein développement de ces activités et pour cela, elle ré- organise son département de recherches. Le ou la RRD travaillera avec une équipe sur des thématiques concertées sur la plantation…\nDate limite : 31/07/2022\n \n\nURGENT\nTÉLÉ-SECRÉTAIRE FRANCOPHONE POLYVALENTE\nNOSYCOM\nContrat CDI\nNOSYCOM (Antsahavola Antananarivo) recrute des : TELESECRETAIRES MEDICALES FRANCOPHONES POLYVALENTES (Femme) (appels entrants). Votre mission sera de gérer les appels, fixer les rendez-vous, noter les…\n \n\nURGENT\nDES DÉVELOPPEURS .NET CONFIRMÉ/ SÉNIOR\nBOCASAY\nContrat CDI\nGarant de la veille technologique, nous serons à l’écoute de vos propositions d’évolutions. Vous interviendrez sur le développement d'applications web autour des aspects suivants : _ Développement,…\n \n\nURGENT\nDEVELOPPEURS PYTHON\nBOCASAY\nContrat CDI\nAu sein d’une équipe à taille humaine rassemblant des compétences variées, dans une bonne ambiance de travail, vous développerez en équipe des solutions web à fortes valeurs ajoutées. Garant de la veille…\n \nURGENT\nDEVELOPPEURS WORDPRESS ET PRESTASHOP -RÉF:DEV/0722\nLes Ateliers du Capricorne\nContrat CDI\n• Développement et intégration site web sous Wordpress, Prestashop, web services et applicatifs. • Personnalisation de site web à partir de template. • Développement des modules sous Wordpress, Prestashop.…\n \nURGENT\nDEVELOPPEURS PHP -RÉF:DEV/07/22\nLes Ateliers du Capricorne\nContrat CDI\n‣ Développer des logiciels au sein de plateformes existantes. ‣ Respecter les bonnes pratiques de développement, build et delivery. ‣ Répondre aux besoins des clients au travers de nouvelles fonctionnalités.…\n \nURGENT\nDES STAGIAIRES CHARGE(E)S RH\nLes Ateliers du Capricorne\nContrat Avec possibilité d'embauche\nAvec un accompagnement par nos soins, le stagiaire aura pour mission d’apporter son appui sur trois volets: - L’administration du personnel : Gestion des dossiers du personnel, gestion des absences, gestions…\n \n\nURGENT\nCONSEILLERS CLIENTS\nODITY\nContrat CDI\n- Traitements d’appels : conseiller et assister la clientèle au téléphone - Traitements de mails - Traiter les demandes dans le respect de la qualité de la relation client - Garantir la satisfaction client\n19\nJuil\n2022\nURGENT\nRESPONSABLE GESTION DES STOCKS\nRECRUITMENT CONSULTING\nContrat -\nUne grande société experte en Construction, Aménagement et décorations recrute son/sa RESPONSABLE GETSION DES STOCKS Missions: Optimiser les stocks et organiser l’entrepôt Améliorer la gestion de l’approvisionnement…\nDate limite : 19/08/2022\n19\nJuil\n2022\n\nURGENT\nSALES ACCOUNT MANAGER\nHelios Towers - Madagascar\nContrat CDI\nThis role will support the Head of Sales in implementing sales strategies and manage customer relations between our team and our key stakeholders. The role will report to the Head if sales and will be…\n19\nJuil\n2022\nURGENT\nINGENIEUR PEDAGOGIQUE\nAXIAN\nContrat CDI\n- Manager son équipe et contribuer à leur montée en compétences - Participer à la définition de la stratégie annuelle ou pluri annuelle de la stratégie d’Axian University - Prendre en charge des missions/actions…\n19\nJuil\n2022\nURGENT\nDES MANAGERS -RÉF:AC-2022\nLes Ateliers du Capricorne\nContrat CDI\nLes Ateliers du Capricorne, société de 300 salariés, appartenant à un groupe français spécialisé dans la composition de livres et de catalogues sur ordinateurs, recherche dans le cadre de son développement…\n19\nJuil\n2022\nDÉVELOPPEUR JAVASCRIPT -RÉF:DEV_JS_072022\nMADASOFTWARE\nContrat CDI\nAnalyse et développement des modules et applications en utilisant le langage Javascript\n19\nJuil\n2022\nTÉLÉASSISTANT(E)S -RÉF:ASSIST_072022\nMADASOFTWARE\nContrat CDI\n- Assurer la prise en main des demandes des clients - Transmettre les demandes aux services responsables - Suivre les demandes en cours de traitement\n19\nJuil\n2022\nURGENT\nTEAM LEADER SI COLLABORATIFS (SSII)\nRecruitment consulting\nContrat CDI\n-Assurer la bonne pratique de la méthodologie projet de la société par son équipe afin de garantir la qualité des prestations délivrées aux clients. -Superviser la réalisation des projets sur le plan…\nDate limite : 19/08/2022\n19\nJuil\n2022\nURGENT\nLEAD TECHNIQUE DEV (SSII)\nRecruitment consulting\nContrat CDI\n-Assurer un rôle de coach et d’expert technique -Conseiller, assister et former les équipes de développement afin d’améliorer leurs compétences et leurs performances -Participer aux différentes phases…\nDate limite : 19/08/2022\n19\nJuil\n2022\nURGENT\nINGENIEUR D’ETUDE ET DE DEVELOPPEMENT APPLICATION MOBILE NATIVE (SSII)\nRecruitment consulting\nContrat CDI\n-Concevoir, préconiser et mettre en œuvre les solutions techniques pour développer une application spécifiques destinées à l’environnement Mobile. -Veiller à leur stabilité dans le temps et participer…\nDate limite : 19/08/2022\n19\nJuil\n2022\nURGENT\nTESTEUR QUALITÉ (INFORMATIQUE)\nRecruitment consulting\nContrat CDI\n-Réaliser des mesures d'évaluation de la qualité des projets -Examiner attentivement les plans, les spécifications et les plans pour comprendre les exigences du projet -Résoudre les problèmes liés…\nDate limite : 19/08/2022\n19\nJuil\n2022\nURGENT\nCOMPTABLE JUNIOR - TOAMASINA\nAMBATOVY\nContrat CDI\nVotre rôle consiste à soutenir en permanence les Comptables et les Comptables Senior du Service Trésorerie aux tâches liées au paiement des fournisseurs, en classant la documentation de sauvegarde pour…\nDate limite : 29/07/2022\n19\nJuil\n2022\n\nURGENT\nUN MANAGER ICT -RÉF:0288-22 KR-TIC\nKENTIA-RH.COM sarl\nContrat CDI\nResponsabilités / Missions .Élaborer les politiques et règles ICT (Information, Communication et Technologie) de la société .Définir les rôles et responsabilités du service informatique .Assurer la gestion…\nDate limite : 11/08/2022\n\n14\nJuil\n2022\nPROFESSEURS POUR UNE ECOLE FRANCAISE - RÉGION D'ANALANJOROFO\n Contrat : CDI\nSecteur : Enseignement\nURGENT\n19\nJuil\n2022\nRESPONSABLE GESTION DES STOCKS\n Contrat : CDI\nSecteur : Logistique / Achats\nURGENT\n19\nJuil\n2022\nSALES ACCOUNT MANAGER\n Contrat : CDI\nSecteur : Commercial / Vente\nURGENT\n19\nJuil\n2022\nINGENIEUR PEDAGOGIQUE\n Contrat : CDI\nSecteur : Management / RH\nURGENT\n19\nJuil\n2022\nDES MANAGERS -RÉF:AC-2022\n Contrat : CDI\nSecteur : Management / RH\nURGENT\n19\nJuil\n2022\nTEAM LEADER SI COLLABORATIFS (SSII)\n Contrat : CDI\nSecteur : Informatique / web\nURGENT\n19\nJuil\n2022\nLEAD TECHNIQUE DEV (SSII)\n Contrat : CDI\nSecteur : Informatique / web\nURGENT\n19\nJuil\n2022\nINGENIEUR D’ETUDE ET DE DEVELOPPEMENT APPLICATION MOBILE NATIVE (SSII)\n Contrat : CDI\nSecteur : Informatique / web\nURGENT\n19\nJuil\n2022\nTESTEUR QUALITÉ (INFORMATIQUE)\n Contrat : CDI\nSecteur : Informatique / web\nURGENT\n\nTelma Madagascar\nLES SERVICES GRATUITS SUR PORTALJOB\nRECRUTEURS\nDiffusion des offres d'emploi\nPlateforme unique pour la gestion des candidatures\nConsultation des profils des candidats\nFOMATEURS\nDiffusion de vos offres de formation dans notre annuaire professionnelle\nOrganisation des séances de formation avec les entreprises partenaires\nCANDIDATS\nConsultation parmi une large offre d'emploi\nPostuler en ligne avec votre CV personnel\nRAPIDE, SIMPLE ET EFFICACE\nRestez en contact avec les professionnels pour développer vos activités ou vos projets.\nON VEUT VOTRE TALENT\nOffres d'emploi par secteur\nBiologie / chimie / Sciences\nCommercial / Vente\nConfection / Artisan\nConseiller client / Call center\nConsultant / Enquêteur\nDroit / Juriste\nEnseignement\nVoir tous les secteurs\nAccès rapide\nMentions légales\nQui sommes nous ?\nContactez nous\nAnnuaires formations\n© 2016 Portal Job Madagascar\n");
				
				dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						SketchwareUtil.showMessage(getApplicationContext(), "CANCEL PRESSED");
					}
				});
				dialog.create().show();
			}
		});
	}
	
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		SketchwareUtil.showMessage(getApplicationContext(), "welcome ! ");
	}
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
