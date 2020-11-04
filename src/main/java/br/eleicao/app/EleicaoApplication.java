package br.eleicao.app;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Candidato;
import br.eleicao.app.model.Eleitor;
import br.eleicao.app.model.Municipio;
import br.eleicao.app.model.Voto;
import br.eleicao.app.model.ZonaEleitoral;
import br.eleicao.app.repository.CandidatoRepository;
import br.eleicao.app.repository.EleitorRepository;
import br.eleicao.app.repository.MunicipioRepository;
import br.eleicao.app.repository.VotoRepository;
import br.eleicao.app.repository.ZonaEleitoralRepository;

@SpringBootApplication
public class EleicaoApplication implements CommandLineRunner {

	final MunicipioRepository _municipioRepository; // Criando propriedade da Interface Município
	final EleitorRepository _eleitorRepository;
	final CandidatoRepository _candidatoRepository;
	final VotoRepository _votoRepository;
	final ZonaEleitoralRepository _zonaEleitoralRepository;

	public EleicaoApplication(MunicipioRepository municipioRepository, EleitorRepository eleitorRepository,
		CandidatoRepository candidatoRepository, VotoRepository votoRepository,
		ZonaEleitoralRepository zonaEleitoralRepository) {
		_municipioRepository = municipioRepository; // Alimentando a propriedade com a construção da classe
		_eleitorRepository = eleitorRepository;
		_candidatoRepository = candidatoRepository;
		_votoRepository = votoRepository;
		_zonaEleitoralRepository = zonaEleitoralRepository;

	}

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
		
// Salvar Zona Eleitoral
//		ZonaEleitoral zonaEleitoral = new ZonaEleitoral();
//		zonaEleitoral.setNome("A239");
//		_zonaEleitoralRepository.save(zonaEleitoral);		
//		System.out.println("Zona Eleitoral salvo com sucesso!");
//		
//		ZonaEleitoral zonaEleitoral1 = new ZonaEleitoral();
//		zonaEleitoral1.setNome("A240");
//		_zonaEleitoralRepository.save(zonaEleitoral1);		
//		System.out.println("Zona Eleitoral salvo com sucesso!");


// Deletando um  Zona Eleitoral
//		ZonaEleitoral zonaEleitora = new ZonaEleitora();	
//		zonaeleitoral.setId(new Long(1));
//		_zonaeleitoralRepository.delete(zonaEleitoral);;
//		System.out.println("Zona Eleitoral deletado com sucesso!");

// Atualizando uma Zona Eleitoral
//		ZonaEleitoral zonaEleitora = new ZonaEleitora()
//		zonaeleitoral.setID(new Long(2));
//		zonaeleitoral.setNome("A899");
//		_zonaEleitoralRepository.save(zonaEleitoral);		
//		System.out.println("Zona Eleitoral atualizada com sucesso!");	

		
// Selecionando apenas UMA Zona Eleitoral
//		Optional<ZonaEleitoral> zonaEleitoral = _zonaEleitoralRepository.findById(new Long(2));
//		System.out.println("Zona Eleitoral: " + candidato.get().getNome());

// Selecionando todas as Zonas Eleitorais
//		Iterable<ZonaEleitoral> zonaEleitoral = _zonaEleitoralRepository.findAll();
//		for (ZonaEleitoral m : zonaEleitoral) {
//			System.out.println("Zona Eleitoral: " + m.getNome());
				
		
//============================================================================
		
// Salvar Eleitor
//		Eleitor eleitor = new Eleitor();
//		Voto voto = new Voto();
//		voto.votoId(3l);
//		eleitor.setNome("Tarsila");
//		_eleitorRepository.save(eleitor);		
//		System.out.println("Eleitor salvo com sucesso!");
//		
//		Eleitor eleitor1 = new Eleitor();
//		Voto voto1 = new Voto();
//		voto1.votoId(2l);
//		eleitor1.setNome("Marina");
//		_eleitorRepository.save(eleitor1);		
//		System.out.println("Eleitor salvo com sucesso!");

// Deletando um Eleitor
//		Eleitor eleitor = new Eleitor();	
//		eleitor.setId(new Long(1));
//		_eleitorRepository.delete(eleitor);;
//		System.out.println("Eleitor deletado com sucesso!");

		// Atualizando um Eleitor
//		Eleitor eleitor = new Eleitor();
//		eleitor.setID(new Long(2));
//		eleitor.setNome("Gabriela");
//		_eleitorRepository.save(eleitor);		
//		System.out.println("Eleitor atualizado com sucesso!");	

		
//		// Selecionando apenas UM Eleitor
//		Optional<Candidato> candidato = _candidatoRepository.findById(new Long(2));
//		System.out.println("Candidato: " + candidato.get().getNome());

		// Selecionando todos os Eleitor
//		Iterable<Candidato> candidato = _candidatoRepository.findAll();
//		for (Candidato m : candidato) {
//			System.out.println("Candidato: " + m.getNome());

				

//========================================================================		
		
// Salvar Voto
//		Voto voto = new Voto();
//		Candidato candidato = new Candidato();
//		Eleitor eleitor = new Eleitor();
//		ZonaEleitoral zonaEleitoral = new ZonaEleitoral();
//		candidato.setId(3l);
//		eleitor.setID(2l);
//		zonaEleitoral.setID(3l);
//		voto.setVoto(voto);
//		_votoRepository.save(voto);
//		System.out.println("Voto computado com sucesso!");

//		Voto voto = new Voto();
//		Candidato candidato = new Candidato();
//		Eleitor eleitor = new Eleitor();
//		ZonaEleitoral zonaEleitoral = new ZonaEleitoral();
//		candidato.setId(2l);
//		eleitor.setID(3l);
//		zonaEleitoral.setID(1l);
//		voto.setVoto(voto);
//		_votoRepository.save(voto);
//		System.out.println("Voto computado com sucesso!");
		
// Deletando um Voto
//		Voto voto = new Voto();	
//		voto.setId(new Long(1));
//		_votoRepository.delete(voto);;
//		System.out.println("Voto deletado com sucesso!");

// Atualizando um Voto
//		Voto voto = new Voto();	
//		voto.setId(new Long(1));
//		voto.setId(2l);
//		candidato.setCandidato("Vereador");	
//		voto.setVoto();		
//		_votoRepository.save(voto);		
//		System.out.println("Voto atualizado com sucesso!");			
		
// Selecionando apenas UM Voto
//		Optional<Voto> voto = _votoRepository.findById(new Long(2));
//		System.out.println("Voto: " + voto.get().getId());

// Selecionando todos os Votos
//		Iterable<Voto> voto = _votoRepository.findAll();
//		for (Voto m : voto) {
//			System.out.println("Voto: " + m.getId());


//========================================================================
 

//Salvar Município
//  Municipio municipio = new Municipio();
//  municipio.setNome("São Paulo");
//  municipio.setPopulacao(14000000);		
//  _municipioRepository.save(municipio);		
//  System.out.println("Município salvo com sucesso!");

//Deletando um município
//  Municipio municipio = new Municipio();		
//  municipio.setId(new Long(1));
//  _municipioRepository.delete(municipio);;
//  System.out.println("Município deletado com sucesso!");

//Atualizando um município
//  Municipio municipio = new Municipio();
//  municipio.setID(new Long(2));
//  municipio.setNome("São Paulo");
//  municipio.setPopulacao(14000000);		
//_ municipioRepository.save(municipio);		
//  System.out.println("Município atualizado com sucesso!");	

//Selecionando apenas UM município
//  Optional<Municipio> municipio = _municipioRepository.findById(new Long(2));
//  System.out.println("Município: " + municipio.get().getNome());

//Selecionando todos os municípios
//   Iterable<Municipio> municipios = _municipioRepository.findAll();
//   for (Municipio m : municipios) {
//	 System.out.println("Município: " + m.getNome());

//======================================================================

// Salvar Candidato
//		Candidato candidato = new Candidato();
//		Municipio municipio = new Municipio();
//		municipio.setID(3l);
//		candidato.setNome("Carlos Miranda");
//		candidato.setNumero("234");	
//		candidato.setCategoria("Vereador");	
//		candidato.setMunicipio(municipio);
//		_candidatoRepository.save(candidato);		
//		System.out.println("Candidato salvo com sucesso!");

// Deletando um Candidato
//		Candidato candidato = new Candidato();	
//		candidato.setId(new Long(1));
//		_candidatoRepository.delete(candidato);;
//		System.out.println("Candidato deletado com sucesso!");

// Atualizando um Candidato
//		Candidato candidato = new Candidato();
//		candidato.setID(new Long(2));
//		candidato.setNome("Pedro Paulo");
//		candidato.setCategoria("Vereador");	
//		candidato.setNumero("345");		
//		_candidatoRepository.save(candidato);		
//		System.out.println("Candidato atualizado com sucesso!");	

// Selecionando apenas UM Candidato
//		Optional<Candidato> candidato = _candidatoRepository.findById(new Long(2));
//		System.out.println("Candidato: " + candidato.get().getNome());

// Selecionando todos os Candidato
//		Iterable<Candidato> candidato = _candidatoRepository.findAll();
//		for (Candidato m : candidato) {
//			System.out.println("Candidato: " + m.getNome());
