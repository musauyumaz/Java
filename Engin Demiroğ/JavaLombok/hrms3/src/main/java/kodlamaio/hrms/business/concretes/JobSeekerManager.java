package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(jobSeekerDao.findAll()," İş Arayanlar Listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		jobSeekerDao.save(jobSeeker);
		return new SuccessResult(jobSeeker.getName()+ " Eklendi");
	}

	@Override
	public DataResult<JobSeeker> getByNationalIdentity(String nationalIdentity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobSeeker> findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
