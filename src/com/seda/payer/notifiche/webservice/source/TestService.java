package com.seda.payer.notifiche.webservice.source;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniRequestType;
import com.seda.payer.notifiche.webservice.dati.DownloadQuietanzaBollettiniResponseType;
import com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaRequestType;
import com.seda.payer.notifiche.webservice.dati.NotificaAutorizzazioneBancaResponseType;
import com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniRequestType;
import com.seda.payer.notifiche.webservice.dati.NotificaQuietanzaBollettiniResponseType;
import com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchRequestType;
import com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoBatchResponseType;
import com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoRequestType;
import com.seda.payer.notifiche.webservice.dati.NotificaTentativiPagamentoResponseType;


public class TestService {

	public static void main(String[] args) {
		String messaggio = "";
		try {
			
			NotificheServiceLocator notificheServiceLocator=new NotificheServiceLocator();
			NotificheSOAPBindingStub notifiche=(NotificheSOAPBindingStub) notificheServiceLocator.getNotifichePort(
					new URL("http://10.10.80.6:8857/NotificheService/notifiche"));
			
			notifiche.setHeader("http://dati.webservice.notifiche.payer.seda.com", "codUtente", "000LP");
			
			/*
			NotificaTentativiPagamentoRequestType in=new NotificaTentativiPagamentoRequestType();
			in.setChiave_transazione("000d19c8-041e-42e2-bbc1-680ac58f724e");
			in.setData_transazione("18/01/2012 18:53:00");
			NotificaTentativiPagamentoResponseType  out=notifiche.notificaTentativiPagamento(in);
			System.out.println(out.getResponse().getRetcode().getValue());
			System.out.println(out.getResponse().getRetmessage());
			
			*/
			
			/*
			NotificaTentativiPagamentoBatchRequestType in2=new NotificaTentativiPagamentoBatchRequestType();
			NotificaTentativiPagamentoRequestType[] listaAnalisiCF = new NotificaTentativiPagamentoRequestType[5];
			
			 
			listaAnalisiCF[0]=new NotificaTentativiPagamentoRequestType();
			listaAnalisiCF[0].setChiave_transazione("000d19c8-041e-42e2-bbc1-680ac58f724e");
			listaAnalisiCF[0].setData_transazione("18/01/2012 18:53:00");
			
			listaAnalisiCF[1]=new NotificaTentativiPagamentoRequestType();
			listaAnalisiCF[1].setChiave_transazione("000d19c8-041e-42e2-bbc1-680ac58f724e");
			listaAnalisiCF[1].setData_transazione("18/01/2012 18:53:00");
			
			listaAnalisiCF[2]=new NotificaTentativiPagamentoRequestType();
			listaAnalisiCF[2].setChiave_transazione("000d19c8-041e-42e2-bbc1-680ac58f724e");
			listaAnalisiCF[2].setData_transazione("18/01/2012 18:53:00");
			
			listaAnalisiCF[3]=new NotificaTentativiPagamentoRequestType();
			listaAnalisiCF[3].setChiave_transazione("000d19c8-041e-42e2-bbc1-680ac58f724e");
			listaAnalisiCF[3].setData_transazione("18/01/2012 18:53:00");
			
			listaAnalisiCF[4]=new NotificaTentativiPagamentoRequestType();
			listaAnalisiCF[4].setChiave_transazione("000d19c8-041e-42e2-bbc1-680ac58f724e");
			listaAnalisiCF[4].setData_transazione("18/01/2012 18:53:11");
			
			in2.setListaAnalisiCF(listaAnalisiCF);
			NotificaTentativiPagamentoRequestType[] listaAnalisiEmail=new NotificaTentativiPagamentoRequestType[2];
			
			listaAnalisiEmail[0]=new NotificaTentativiPagamentoRequestType();
			listaAnalisiEmail[0].setChiave_transazione("000d19c8-041e-42e2-bbc1-680ac58f724e");
			listaAnalisiEmail[0].setData_transazione("18/01/2012 18:53:00");
			
			listaAnalisiEmail[1]=new NotificaTentativiPagamentoRequestType();
			listaAnalisiEmail[1].setChiave_transazione("000d19c8-041e-42e2-bbc1-680ac58f724e");
			listaAnalisiEmail[1].setData_transazione("18/01/2012 18:53:00");
			
			in2.setListaAnalisiEmail(listaAnalisiEmail);
			
			NotificaTentativiPagamentoBatchResponseType  out2= notifiche.notificaTentativiPagamentoBatch(in2);
			System.out.println(out2.getResponse().getRetcode().getValue());
			System.out.println(out2.getResponse().getRetmessage());
			
			*/
			
			
			
			DownloadQuietanzaBollettiniRequestType in=new DownloadQuietanzaBollettiniRequestType();
			
			in.setChiave_transazione("40540316-3d38-4e0e-a721-da475848f63d");
			DownloadQuietanzaBollettiniResponseType out;
			out=notifiche.downloadQuietanzaBollettini(in);
			System.out.println(out.getFileName());
			System.out.println(out.getResponse().getRetcode().getValue());
			System.out.println(out.getResponse().getRetmessage());
			

			// ==========================================================================================================================

			/** 
			 * we test notificaAutorizzazioneBanca 
			 * */
			/*NotificheServiceLocator notificheServiceLocator=new NotificheServiceLocator();
			NotificheInterface notifiche= notificheServiceLocator.getNotifichePort(
					new URL("http://10.10.80.6:9078/NotificheService/notifiche"));
			NotificaAutorizzazioneBancaRequestType in = new NotificaAutorizzazioneBancaRequestType(); {
				in.setChiave_transazione("74545b0b-49c6-4c1d-8f93-b93565c6c88c");
				in.setTipo_destinatario("C");
				in.setTipo_notifica("E");
				in.setModalita("");
			}
			NotificaAutorizzazioneBancaResponseType response = notifiche.notificaAutorizzazioneBanca(in);
			System.out.println(response.getResponse().getRetcode());
			System.out.println(response.getResponse().getRetmessage());*/

			// ==========================================================================================================================

//			/** 
//			 * we test notificaQuietanzaBollettini 
//			 * */
//			EMailSenderServiceLocator serviceLocator = new EMailSenderServiceLocator();
//			EMailSenderInterface emailSenderInterface = serviceLocator.getEMailSenderPort(new URL("http://10.10.9.38:9080/EMailSender/service"));
//            EMailSenderRequestType request = new EMailSenderRequestType();
//            EMailSenderResponse response;
//            request.setEMailDataTOList("marco.montisano@gmail.com");
//            request.setEMailDataCCList("");
//            request.setEMailDataCCNList("");
//            request.setEMailDataAttacchedFileList("\\\\10.10.9.106\\BirtReport\\demo_attach_file.txt");
//            request.setEMailDataSubject("Email di prova");
//            request.setEMailDataText("test");
//            request.setEMailSender("");
//            response = emailSenderInterface.getEMailSender(request);
//            System.out.println(response.getValue());

			// ==========================================================================================================================

//			/** 
//			 * we test notificaQuietanzaBollettini 
//			 * */
			/*
			NotificheServiceLocator notificheServiceLocator=new NotificheServiceLocator();
			NotificheInterface notifiche= notificheServiceLocator.getNotifichePort(
					new URL("http://10.10.80.6:9580/NotificheService/notifiche"));
			NotificaQuietanzaBollettiniRequestType bollettiniRequestType = new NotificaQuietanzaBollettiniRequestType();
			bollettiniRequestType.setChiave_transazione("375c2b7b-5bac-4a06-8e25-cf620d4d4021");
			bollettiniRequestType.setTipo_notifica("E");
			bollettiniRequestType.setModalita("O");
			bollettiniRequestType.setTipoGateway("P");

			NotificaQuietanzaBollettiniResponseType bollettiniResponseType;
			bollettiniResponseType=notifiche.notificaQuietanzaBollettini(bollettiniRequestType);
			System.out.println(bollettiniResponseType.getResponse().getRetcode());
			System.out.println(bollettiniResponseType.getResponse().getRetmessage());
*/
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'url non è esatta";
		} catch (ServiceException ex) {
			ex.printStackTrace();
			messaggio = "errore: la creazione della chiamata è fallita";
		} catch (RemoteException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'invocazione del WS è fallita";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(messaggio);
		}
	}
}